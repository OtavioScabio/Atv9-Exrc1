package com.example.atv9_exrc1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.atv9_exrc1.controller.IOperacao;
import com.example.atv9_exrc1.controller.OperacaoAtletaJuvenil;
import com.example.atv9_exrc1.controller.OperacaoAtletaSenior;
import com.example.atv9_exrc1.model.atletaJuvenil;
import com.example.atv9_exrc1.model.atletaSenior;

import java.util.List;

//Otávio Gabriel Ribeiro Scabio - RA: 1110482223043
public class AtletaSeniorFragment extends Fragment {

    private View view;
    private EditText etNomeAS;
    private EditText etBairroAS;
    private EditText etDataNascimentoAS;
    private RadioButton rbTemProbCardAS;
    private RadioButton rbNaoTemProbCardAS;
    private Button btnCadastrarAS;
    private TextView tvListaAS;

    public AtletaSeniorFragment() {
        super();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_atleta_senior, container, false);
        etNomeAS = view.findViewById(R.id.etNomeAS);
        etBairroAS = view.findViewById(R.id.etBairroAS);
        etDataNascimentoAS = view.findViewById(R.id.etDataNascimentoAS);
        rbTemProbCardAS = view.findViewById(R.id.rbTemProbCardAS);
        rbNaoTemProbCardAS = view.findViewById(R.id.rbNaoTemProbCardAS);
        btnCadastrarAS = view.findViewById(R.id.btnCadastrarAS);
        tvListaAS = view.findViewById(R.id.tvListaAS);
        tvListaAS.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        btnCadastrarAS.setOnClickListener(op -> cadastro());

        return view;
    }

    private void cadastro() {
        atletaSenior as = new atletaSenior();
        as.setNome(etNomeAS.getText().toString());
        as.setBairro(etBairroAS.getText().toString());
        as.setDataNasc(etDataNascimentoAS.getText().toString());
        if (rbTemProbCardAS.isChecked()) {
            boolean problemaCardiaco = true;
            as.setProblemaCardiaco(problemaCardiaco);
        }
        if (rbNaoTemProbCardAS.isChecked()) {
            boolean problemaCardiaco = false;
            as.setProblemaCardiaco(problemaCardiaco);
        }

        IOperacao<atletaSenior> op = new OperacaoAtletaSenior();
        op.cadastrar(as);
        List<atletaSenior> lista = op.listar();

        Toast.makeText(view.getContext(), as.toString(), Toast.LENGTH_LONG).show();

        StringBuffer buffer = new StringBuffer();
        for (atletaSenior i : lista) {
            buffer.append(i.toString() + "\n");
        }
        tvListaAS.setText(buffer.toString());
        limpaCampos();


    }

    private void limpaCampos() {
        etNomeAS.setText("");
        etBairroAS.setText("");
        etDataNascimentoAS.setText("");
    }
}