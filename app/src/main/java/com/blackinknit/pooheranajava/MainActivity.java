package com.blackinknit.pooheranajava;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        Funcionario victor = new Funcionario();
        Gerente GerenteLucas = new Gerente();

        GerenteLucas.setNome("GerenteLucas");
        GerenteLucas.setDataAdmissao("01/02/1993");
        GerenteLucas.setSalario("2.050");
        GerenteLucas.setComissao(15);
        GerenteLucas.setTotalFuncionarios(12);
        GerenteLucas.setDataNascimento("02/12/1966");


    }
}