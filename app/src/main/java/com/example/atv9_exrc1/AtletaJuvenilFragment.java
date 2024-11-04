package com.example.atv9_exrc1;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.example.atv9_exrc1.controller.IOperacao;
import com.example.atv9_exrc1.controller.OperacaoAtletaJuvenil;
import com.example.atv9_exrc1.model.atletaJuvenil;
import java.util.List;

//Otávio Gabriel Ribeiro Scabio - RA: 1110482223043
public class AtletaJuvenilFragment extends Fragment {

    private View view;
    private EditText etNomeAJ;
    private EditText etBairroAJ;
    private EditText etDataNascimentoAJ;
    private EditText etAnosPraticaAJ;
    private Button btnCadastrarAJ;
    private TextView tvListaAJ;

    public AtletaJuvenilFragment() {
        super();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_atleta_juvenil, container, false);
        etNomeAJ = view.findViewById(R.id.etNomeAJ);
        etBairroAJ = view.findViewById(R.id.etBairroAJ);
        etDataNascimentoAJ = view.findViewById(R.id.etDataNascimentoAJ);
        etAnosPraticaAJ = view.findViewById(R.id.etAnosPraticaAJ);
        btnCadastrarAJ = view.findViewById(R.id.btnCadastrarAJ);
        tvListaAJ = view.findViewById(R.id.tvListaAJ);
        tvListaAJ.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        btnCadastrarAJ.setOnClickListener(op -> cadastro());

        return view;
    }

    private void cadastro() {
        atletaJuvenil aj = new atletaJuvenil();
        aj.setNome(etNomeAJ.getText().toString());
        aj.setBairro(etBairroAJ.getText().toString());
        aj.setDataNasc(etDataNascimentoAJ.getText().toString());
        aj.setAnosPratica(etAnosPraticaAJ.getText().toString());

        IOperacao<atletaJuvenil> op = new OperacaoAtletaJuvenil();
        op.cadastrar(aj);
        List<atletaJuvenil> lista = op.listar();

        StringBuffer buffer = new StringBuffer();
        for (atletaJuvenil i : lista ){
            buffer.append(i.toString()+ "\n");
        }

        Toast.makeText(view.getContext(), aj.toString(), Toast.LENGTH_LONG).show();

        tvListaAJ.setText(buffer.toString());
        limpaCampos();


    }

    private void limpaCampos() {
        etNomeAJ.setText("");
        etBairroAJ.setText("");
        etDataNascimentoAJ.setText("");
        etAnosPraticaAJ.setText("");

    }


}