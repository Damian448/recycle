package com.example.myrecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    private var listaCompras: MutableList<dtProductos> = mutableListOf()
    private lateinit var recycler: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listaCompras.add(dtProductos("Arroz Blanco","1","Arroz de grano largo y fino, ideal para acompañar cualquier platillo.","15","20"))
        listaCompras.add(dtProductos("Aceite de Oliva Extra Virgen","2","Aceite de oliva de alta calidad, prensado en frío, con sabor y aroma intensos","75","100"))
        listaCompras.add(dtProductos("Pasta de Trigo Integral","3","Pasta elaborada con harina de trigo integral, rica en fibra y nutrientes.","25","30"))
        listaCompras.add(dtProductos("Lentejas Secas","4","Lentejas secas, fuente de proteínas y fibra, ideales para guisos y sopas.","12","15"))
        listaCompras.add(dtProductos("Salsa de Tomate Casera","5","Salsa de tomate natural, sin conservantes ni aditivos, perfecta para pasta y pizzas.","15","25"))
        listaCompras.add(dtProductos("Avena en Hojuelas","6"," Avena en hojuelas, fuente de energía y fibra, ideal para el desayuno","15","18"))
        listaCompras.add(dtProductos("Miel Pura de Abeja","7"," Miel natural, sin procesar, con propiedades antioxidantes y beneficios para la salud.","35","50"))
        listaCompras.add(dtProductos("Harina de Almendra","8","Harina sin gluten, hecha a partir de almendras molidas, perfecta para repostería.","25","35"))
        listaCompras.add(dtProductos("Quinoa Orgánica","9","Quinoa de cultivo orgánico, rica en proteínas y aminoácidos esenciales","25","35"))
        listaCompras.add(dtProductos("Vinagre Balsámico de Modena","10","Vinagre balsámico envejecido, con sabor agridulce, perfecto para ensaladas y aderezos.","35","60"))
        listaCompras.add(dtProductos("Chía Orgánica","11","Semillas de chía orgánicas, ricas en omega-3, fibra y antioxidantes.","18","12"))
        listaCompras.add(dtProductos("Café Arábica","12","Café arábica de alta calidad, tostado medio, con notas suaves y aroma intenso.","50","45"))
        listaCompras.add(dtProductos("Azúcar de Coco","13","Azúcar natural extraída del néctar de coco, con bajo índice glucémico.","40","35"))
        listaCompras.add(dtProductos("Cacao en Polvo","14","Cacao en polvo puro, sin azúcares añadidos, perfecto para hacer chocolate caliente o repostería.","30","15"))
        listaCompras.add(dtProductos("Almendras Tostadas y Saladas","15","Almendras tostadas y saladas, aperitivo saludable y delicioso.","70","65"))
        listaCompras.add(dtProductos("Sopa Instantánea de Misu","16","Sopa instantánea de miso, elaborada con ingredientes naturales, ideal para una comida rápida y reconfortante.","15","12"))
        listaCompras.add(dtProductos("Sal Rosada del Himalaya","17"," Sal rosada natural, rica en minerales, proveniente de las montañas del Himalaya.","15","12"))
        listaCompras.add(dtProductos("Sardinas en Aceite de Oliva","18"," Sardinas en aceite de oliva, enlatadas frescas y ricas en ácidos grasos omega-3.","40","35"))
        listaCompras.add(dtProductos("Harina de Maíz para Arepas","19","Harina de maíz precocida, ideal para hacer arepas tradicionales.","20","15"))
        listaCompras.add(dtProductos("Tomate enlatado","20"," Tomates pelados y enlatados, perfectos para salsas y guisos.","25","22"))

        var tabla= findViewById<RecyclerView>(R. id.TablaPro)
        recycler=tabla
        recycler.layoutManager= LinearLayoutManager(this)
        recycler.adapter=ProductoAdapter(this,listaCompras)
    }

}