package ht.sivgep.pharmacielakay;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.backendless.Backendless;
import com.backendless.BackendlessUser;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.exceptions.BackendlessFault;

import ht.sivgep.pharmacielakay.client.ClientActivity;
import ht.sivgep.pharmacielakay.dialog.Dialog_forget_pass;
import ht.sivgep.pharmacielakay.pharmacie.PharmacieActivity;
import ht.sivgep.pharmacielakay.register.RegisterClientActivity;
import ht.sivgep.pharmacielakay.register.RegisterPharmacieActivity;

import static ht.sivgep.pharmacielakay.utils.BackendSettings.APP_ID;
import static ht.sivgep.pharmacielakay.utils.BackendSettings.SECRET_KEY;
import static ht.sivgep.pharmacielakay.utils.BackendSettings.VERSION;

public class LoginActivity extends AppCompatActivity {

    AppCompatButton btnLogin;
    TextView tvCreateAccount;
    TextView tvForgetPass;
    EditText edtPhone;
    EditText edtPassword;

    ProgressDialog progressDialog;
    SharedPreferences sharedPreferences ;
    SharedPreferences.Editor editor ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Backendless.initApp(this, APP_ID, SECRET_KEY, VERSION);

        progressDialog = new ProgressDialog(LoginActivity.this,
                R.style.Custom);

        tvCreateAccount=(TextView) findViewById(R.id.tvCreateAccount);
        tvForgetPass=(TextView) findViewById(R.id.tvForgetPass);
        edtPhone=(EditText)findViewById(R.id.edtPhone);
        edtPassword=(EditText)findViewById(R.id.edtPassword);
        btnLogin=(AppCompatButton)findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phoneUser=edtPhone.getText().toString();
                String passUser=edtPassword.getText().toString();
                if(phoneUser.equals("")){
                    Toast.makeText(getApplicationContext(),"Entrer numero telephone...", Toast.LENGTH_LONG).show();
                    //phoneUser.length();phoneUser.substring(0,3);
                }
                if(phoneUser.length()<8){
                    Toast.makeText(getApplicationContext(),"Numero Telephone,\nMinimum 8 chiffres...", Toast.LENGTH_LONG).show();
                }
                if(passUser.equals("")){
                    Toast.makeText(getApplicationContext(),"Entrer mot de passe...", Toast.LENGTH_LONG).show();
                }
                if(passUser.length()<6){
                    Toast.makeText(getApplicationContext(),"Mot de passe,\nMinimum 6 caractères...", Toast.LENGTH_LONG).show();
                }
                else{
                    progressDialog.setIndeterminate(true);
                    progressDialog.setMessage("Anthentification en cours...");
                    //progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
                    progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
                    progressDialog.setCancelable(false);
                    progressDialog.show();
                    loadUserInfo(phoneUser,passUser);
                }
            }
        });

        tvCreateAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createAccountOption();
            }
        });

        tvForgetPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getSupportFragmentManager();
                Dialog_forget_pass dialog_forget_pass = Dialog_forget_pass.newInstance("Entrer numéro Telephone:");
                dialog_forget_pass.show(fm, "dialog_forget_pass");
            }
        });
    }

// Show options for create account
    private void createAccountOption() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Enregistrer en tant que:");
        builder.setItems(new CharSequence[]
                        {"CLIENT", "PHARMACIE"},
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Intent i;
                        switch (which) {
                            case 0:
                                i= new Intent(LoginActivity.this, RegisterClientActivity.class);
                                i.putExtra("type", "CLIENT");
                                startActivity(i);
                                break;
                            case 1:
                                i= new Intent(LoginActivity.this, RegisterPharmacieActivity.class);
                                i.putExtra("type", "PHAMARCIE");
                                startActivity(i);
                                break;
                        }
                    }
                });
        builder.create().show();
    }

// get Info user
    private void loadUserInfo(String phoneUser, String passUser) {
        Backendless.UserService.login(phoneUser, passUser, new AsyncCallback<BackendlessUser>() {
            @Override
            public void handleResponse(BackendlessUser response) {
                sharedPreferences = getSharedPreferences("PreferencesTAG", Context.MODE_PRIVATE);
                editor = sharedPreferences.edit();

                editor.putString("telephoneLogin", response.getProperty("telephone").toString());
                editor.putString("typeLogin", response.getProperty("type").toString());
                editor.putString("emailLogin", response.getEmail());
                editor.putString("idUsersLogin", response.getObjectId());
                editor.putInt("hashLogin", response.getEmail().hashCode());
                editor.apply();

                if(response.getProperty("type").toString().equals("CLIENT")){
                    Intent i = new Intent(getApplicationContext(), ClientActivity.class);
                    progressDialog.dismiss();
                    startActivity(i);
                    finish();
                }
                if(response.getProperty("type").toString().equals("PHARMACIE")){
                    Intent i = new Intent(getApplicationContext(), PharmacieActivity.class);
                    progressDialog.dismiss();
                    startActivity(i);
                    finish();
                }
                /*if(response.getProperty("type").toString().equals("ADMINISTRATEUR")){
                    //Intent i = new Intent(getApplicationContext(), ClientNav_Activity.class);
                    Toast.makeText(getApplicationContext(),response.getEmail(), Toast.LENGTH_LONG).show();
                    progressDialog.dismiss();
                    //startActivity(i);
                    //finish();
                }*/
            }

            @Override
            public void handleFault(BackendlessFault backendlessFault) {
                Toast.makeText(getApplicationContext(),backendlessFault.getMessage(), Toast.LENGTH_LONG).show();
                progressDialog.dismiss();
            }
        }, true);
    }
}
