package ht.sivgep.pharmacielakay.dialog;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import ht.sivgep.pharmacielakay.R;

/**
 * Created by ingdjason on 6/7/17.
 */
public class Dialog_forget_pass extends android.support.v4.app.DialogFragment {

    ProgressDialog progressDialog;
    EditText edtPhone;
    AppCompatButton btnVerifier;


    private Context mContext;

    public Dialog_forget_pass() {
        // Required empty public constructor
    }

    public static Dialog_forget_pass newInstance(String title) {
        Dialog_forget_pass frag = new Dialog_forget_pass();
        Bundle args = new Bundle();
        args.putString("title", title);
        frag.setArguments(args);
        return frag;

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View v = inflater.inflate(R.layout.dialog_forget_pass, container, false);
        edtPhone = (EditText) v.findViewById(R.id.edtPhone);
        btnVerifier = (AppCompatButton) v.findViewById(R.id.btnVerifier);

        btnVerifier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phoneUser=edtPhone.getText().toString();
                if(phoneUser.equals("")){
                    Toast.makeText(getContext(),"Entrer numero telephone...", Toast.LENGTH_LONG).show();
                    //phoneUser.length();phoneUser.substring(0,3);
                }
                if(phoneUser.length()<8){
                    Toast.makeText(getContext(),"Numero Telephone,\nMinimum 8 chiffres...", Toast.LENGTH_LONG).show();
                }
                else{
                    progressDialog.setIndeterminate(true);
                    progressDialog.setMessage("Anthentification en cours...");
                    //progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
                    progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
                    progressDialog.setCancelable(false);
                    progressDialog.show();
                }
            }
        });
        return v;
    }

    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        String title = getArguments().getString("title", "title");
        getDialog().setTitle(title);
    }
}