package vakulenko.hw1_lms;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textViewAnsw);

        //Исходные данные
        double totalCost;
        int balance = 45;
        double ostatok;


        double biscuit = 10 * 0.74; //26% скидка
        double cream = 14 * 0.95;   //5% скидка
        double fruit = 3 * 0.88;    //12% скидка
        double nuts = 5 * 0.45;     //55% скидка
        double berries = 7;         //без скидки

        totalCost = biscuit + cream + fruit + nuts + berries;
        ostatok = balance - totalCost;


        //Проверка, хватает ли денег
        if (balance >= totalCost) {
            textView.setText(String.format("У вас достаточно средств для покупки всех ингредиентов! У вас осталось %.2f монет", (ostatok)));
        } else {
            textView.setText("У вас недостаточно средств.");
        }



    }
}