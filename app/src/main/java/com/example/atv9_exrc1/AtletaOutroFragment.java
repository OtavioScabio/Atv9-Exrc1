package com.example.atv9_exrc1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.atv9_exrc1.controller.IOperacao;
import com.example.atv9_exrc1.controller.OperacaoAtletaOutro;
import com.example.atv9_exrc1.model.atletaJuvenil;
import com.example.atv9_exrc1.model.atletaOutro;

import java.util.List;

//Otávio Gabriel Ribeiro Scabio - RA: 1110482223043
public class AtletaOutroFragment extends Fragment {

    private View view;
    private EditText etNomeAO;
    private EditText etBairroAO;
    private EditText etDataNascimentoAO;
    private EditText etAcademiaAO;
    private EditText etRecordeAO;
    private Button btnCadastrarAO;
    private TextView tvListaAO;

    public AtletaOutroFragment() {
        super();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_atleta_outro, container, false);
        etNomeAO = view.findViewById(R.id.etNomeAO);
        etBairroAO = view.findViewById(R.id.etBairroAO);
        etDataNascimentoAO = view.findViewById(R.id.etDataNascimentoAO);
        etRecordeAO = view.findViewById(R.id.etRecordeAO);
        etAcademiaAO = view.findViewById(R.id.etAcademiaAO);
        btnCadastrarAO = view.findViewById(R.id.btnCadastrarAO);
        tvListaAO = view.findViewById(R.id.tvListaAO);
        tvListaAO.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        btnCadastrarAO.setOnClickListener(op -> cadastro());

        return view;
    }

    private void cadastro() {
        atletaOutro ao = new atletaOutro();
        ao.setNome(etNomeAO.getText().toString());
        ao.setBairro(etBairroAO.getText().toString());
        ao.setDataNasc(etDataNascimentoAO.getText().toString());
        ao.setAcademia(etAcademiaAO.getText().toString());
        ao.setRecorde(Double.parseDouble(etRecordeAO.getText().toString()));

        IOperacao<atletaOutro> op = new OperacaoAtletaOutro();
        op.cadastrar(ao);
        List<atletaOutro> lista = op.listar();

        Toast.makeText(view.getContext(), ao.toString(), Toast.LENGTH_LONG).show();


        StringBuffer buffer = new StringBuffer();
        for (atletaOutro i : lista) {
            buffer.append(i.toString() + "\n");
        }
        tvListaAO.setText(buffer.toString());
        limpaCampos();

    }

    private void limpaCampos() {
        etNomeAO.setText("");
        etBairroAO.setText("");
        etDataNascimentoAO.setText("");
        etAcademiaAO.setText("");
        etRecordeAO.setText("");

    }
}