package devandroid.moreira.appconsultamedica.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import devandroid.moreira.appconsultamedica.R;
import devandroid.moreira.appconsultamedica.model.Paciente;

public class MainActivity extends AppCompatActivity {

    Paciente paciente;

    EditText editNomeCompleto;
    EditText editRg;
    EditText editTelefoneContato;
    EditText editEspecialista;

    Button btnSalvar;
    Button btnLimpar;
    Button btnFinalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}