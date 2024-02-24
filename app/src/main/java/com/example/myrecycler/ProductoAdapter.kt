package com.example.myrecycler

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProductoAdapter(var context: Context,
                      var listaCompras: MutableList<dtProductos>)
    : RecyclerView.Adapter<ProductoAdapter.vHolder>()
{
    inner class vHolder(itemView: View) :RecyclerView.ViewHolder(itemView) {
        lateinit var txtnombre: TextView
        init {
            txtnombre=itemView.findViewById(R.id.txtNombre)
        }
        lateinit var txtId: TextView
        init {
            txtId=itemView.findViewById(R.id.txtId)
        }
        lateinit var txtDescripcion: TextView
        init {
            txtDescripcion=itemView.findViewById(R.id.txtDescripcion)
        }
        lateinit var txtMenudeo: TextView
        init {
            txtMenudeo=itemView.findViewById(R.id.txtMenudeo)
        }
        lateinit var txtMayoreo: TextView
        init {
            txtMayoreo=itemView.findViewById(R.id.txtMayoreo)
        }

    }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductoAdapter.vHolder {
            var itemView = LayoutInflater.from(context).inflate(
                R.layout.vista_productos,parent,false)
            return vHolder(itemView)
        }

        override fun getItemCount(): Int {
            return listaCompras.size
        }

        override fun onBindViewHolder(holder: ProductoAdapter.vHolder, position: Int) {
            var producto= listaCompras[position]
            holder.txtnombre.text=producto.Nombre
            holder.txtId.text=producto.Id
            holder.txtDescripcion.text=producto.Descripcion
            holder.txtMenudeo.text=producto.PrecioMenudeo
            holder.txtMayoreo.text=producto.PrecioMayoreo
        }
}