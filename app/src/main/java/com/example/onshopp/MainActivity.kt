package com.example.onshopp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bb = findViewById<Button>(R.id.button)
        bb.setOnClickListener {
            intent=Intent(this,Login::class.java)
            startActivity(intent)
        }

        var arry = ArrayList<items>()
        arry.add(items(R.drawable.meat,"1kg of meat","$10"))
        arry.add(items(R.drawable.beans,"beans","$6"))
        arry.add(items(R.drawable.cassava,"Cassava","$8"))
        arry.add(items(R.drawable.wheat,"Wheat","$10"))
        arry.add(items(R.drawable.sugar,"Sugar","$2"))
        arry.add(items(R.drawable.gnuts,"G-Nuts","$5"))
        arry.add(items(R.drawable.peas,"Peas","$5"))




        mygrid.adapter = mgrid(arry,this)

        mygrid.onItemClickListener=AdapterView.OnItemClickListener { adaptiveView, view, position, id ->

           if (position==0){
               intent= Intent(this,meet::class.java)
               startActivity(intent)
            Toast.makeText(this, "welcome to Butchery",Toast.LENGTH_SHORT).show()
        }
            if (position==1){
                intent= Intent(this,Beans::class.java)
                startActivity(intent)
                Toast.makeText(this, "welcome to beans page",Toast.LENGTH_SHORT).show()
            }

            if (position==2){
                intent= Intent(this,cassava::class.java)
                startActivity(intent)
                Toast.makeText(this, "welcome to cassava page",Toast.LENGTH_SHORT).show()
            }

            if (position==3){
                intent= Intent(this,wheat::class.java)
                startActivity(intent)
                Toast.makeText(this, "welcome to wheat page",Toast.LENGTH_SHORT).show()
            }

            if (position==4){
                intent= Intent(this,sugar::class.java)
                startActivity(intent)
                Toast.makeText(this, "welcome to sugar page",Toast.LENGTH_SHORT).show()
            }

            if (position==5){
                intent= Intent(this,gnuts::class.java)
                startActivity(intent)
                Toast.makeText(this, "welcome to gnuts page",Toast.LENGTH_SHORT).show()
            }

            if (position==6){
                intent= Intent(this,peas::class.java)
                startActivity(intent)
                Toast.makeText(this, "welcome to peas page",Toast.LENGTH_SHORT).show()
            }




        }


    }
    class mgrid (var a: ArrayList<items>,var b:Context): BaseAdapter(){
        val item = a
        val context = b
        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            val inflater = context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE)as LayoutInflater
            val xx = inflater.inflate(R.layout.item,parent,false)
            val imggg = xx.findViewById<ImageView>(R.id.imgv)
            val itnm = xx.findViewById<TextView>(R.id.txtv)
            val prce = xx.findViewById<TextView>(R.id.txtv1)

            imggg.setImageResource(item[position].image!!)
            itnm.text = item[position].itemname
            prce.text = item[position].price

            return xx
        }

        override fun getItem(position: Int): Any {
            return item.get(position)
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getCount(): Int {
            return item.size
        }



    }



}
