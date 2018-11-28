package com.example.omkar.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Main4Activity extends AppCompatActivity {

    //a List of type hero for holding list items
    List<Hero> heroList;

    //the listview
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initializing objects
        heroList = new ArrayList<>();
        listView = (ListView) findViewById(R.id.listView);

        //adding some values to our list
        heroList.add(new Hero("Dr. N K Cauvery ","Professor","cauverynk@rvce.edu.in","9972308043","8086"));
        heroList.add(new Hero("Dr. Ramakanth Kumar P","Professor & Assistant Director SAP","ramakanthkp@rvce.edu.in","9886309520","8191"));
        heroList.add(new Hero("Dr. Srinivasan G N","Professor","srinivasangm@rvce.edu.in","9448379953","8191"));
        heroList.add(new Hero("Dr. Shantaram Nayak","Professor","srnayak@rvce.edu.in","9448019399","8343"));
        heroList.add(new Hero("Dr. Sagar B M","Associate Professor","sagarbm@rvce.edu.in","9886332226","8092"));
        heroList.add(new Hero("Mr. Rajashekara Murthy S","Associate Professor","rajashekara.murthy@rvce.edu.in","9886635858","8344"));
        heroList.add(new Hero("Dr. Mamatha G S","Associate Professor","mamathags@rvce.edu.in","9886311120","8415"));
        heroList.add(new Hero("Dr. Nagaraj G Cholli","Associate Professor","nagaraj.cholli@rvce.edu.in","9916698388","8122"));
        heroList.add(new Hero("Mrs. Geetha V","Associate Professor","geethav@rvce.edu.in","9886104374","8416"));
        heroList.add(new Hero("Mr.Raghavendraprasad SG","Associate Professor","raghavendrap@rvce.edu.in","9845003187","8417"));
        heroList.add(new Hero("Ms. Rashmi R","Associate Professor","rashmir@rvce.edu.in","9844015179","8194"));
        heroList.add(new Hero("Mrs. Kavitha S N","Associate Professor","kavithasn@rvce.edu.in","9242147912","8123"));
        heroList.add(new Hero("Mrs. Rekha B S","Associate Professor","rekhabs@rvce.edu.in","9945164208","8193"));
        heroList.add(new Hero("Mrs. Smitha G R","Associate Professor","smithagr@rvce.edu.in","9480091361","8193"));
        heroList.add(new Hero("Mrs. Swetha S","Associate Professor","shwetha.ise@rvce.edu.in","9008485873","8193"));
        heroList.add(new Hero("Mrs. Anisha B S","Associate Professor","anisha@rvce.edu.in","9538860055","8123"));
        heroList.add(new Hero("Mrs. Priya D","Associate Professor","priyad@rvce.edu.in","9986997603","8123"));
        heroList.add(new Hero("Mr. Srinivas B K","Associate Professor","bksrinivas@rvce.edu.in","9980173921","8122"));
        heroList.add(new Hero("Mrs. Chethana R Murthy","Associate Professor","chethanamurthy@rvce.edu.in","9986011689","8384"));
        heroList.add(new Hero("Mrs. Vanishree K","Associate Professor","vanishreek@rvce.edu.in","9538963471","8193"));
        heroList.add(new Hero("Mrs. Padmashree T","Associate Professor","padmashreet@rvce.edu.in","9538963471","8384"));
        heroList.add(new Hero("Mrs. Sushmitha N","Associate Professor","sushmithan@rvce.edu.in","9449932689","8123"));
        heroList.add(new Hero("Mrs. Poornima Kulkarni","Associate Professor","poornimapk@rvce.edu.in","9902626564","8123"));
        heroList.add(new Hero("Mrs. Merin Meleet","Associate Professor","merinmeleet@rvce.edu.in","8904725680","8384"));








        heroList.add(new Hero("Mr. Ravi Varma R B","System Analyst","ravivarma@rvce.edu.in","9945400987","8347"));
        heroList.add(new Hero("Mr. Umesh I M","System Analyst","umesh.mphil@rvce.edu.in","9880154451","8383"));
        heroList.add(new Hero("Mrs. Maheshwari D G","Programmer","maheshwari@rvce.edu.in","8792463725","8192"));
        heroList.add(new Hero("Mrs. Geetha B G","Instructor","geethabg@rvce.edu.in","9845979770","8377"));
        heroList.add(new Hero("Mr. Vinay Nayak","Programmer II","dnvinay@rvce.edu.in","9845965157","8058"));
        heroList.add(new Hero("Mr. Avinash B V","Programmer II","avinashbv@rvce.edu.in","9740366304","8059"));
        heroList.add(new Hero("Mrs. Yashodha T","Assist. Instructor","yashodha.t@rvce.edu.in","9886891127","8059"));
        heroList.add(new Hero("Mrs. Lakshmi M R","Assist. Instructor","lakshmi.mr@rvce.edu.in","9986073882","8058"));
        heroList.add(new Hero("Mrs. Roopa E","SDC","roopae@rvce.edu.in","9902858744","8091"));
        heroList.add(new Hero("Mr.Raghvendra N","Mechanic","nraghava@rvce.edu.in","9141166455","8377"));
        heroList.add(new Hero("Mr. Dileep Kumar K","Helper","kdileepkumar@rvce.edu.in","8197922590","8192"));
        heroList.add(new Hero("Mr. Ganagadharaiah","Peon","gangadharaiahk@rvce.edu.in","9972549576","8091"));











        heroList.add(new Hero("Mr. Sridhar T N","IT Technician Grade - I","sridhartn@rvce.edu.in","9739461506","8118"));
        heroList.add(new Hero("Mr. Ramesha","IT Technician","rameshkumar@rvce.edu.in","9740362782","8118"));
        heroList.add(new Hero("Mr. Suresh S","IT Technician Grade - I\t","suresh.s@rvce.edu.in","9980131948","8118"));
        heroList.add(new Hero("Renukaradhya","IT Technician","renukaradhya@rvce.edu.in","9916506106","8118"));



        //creating the adapter
        MyListAdapter adapter = new MyListAdapter(this, R.layout.my_custom_list, heroList);

        //attaching adapter to the listview
        listView.setAdapter(adapter);
    }
}
