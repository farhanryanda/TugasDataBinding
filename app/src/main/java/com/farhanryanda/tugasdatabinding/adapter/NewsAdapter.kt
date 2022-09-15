package com.farhanryanda.tugasdatabinding.adapter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.farhanryanda.tugasdatabinding.DetailNewsFragment
import com.farhanryanda.tugasdatabinding.R
import com.farhanryanda.tugasdatabinding.data.News
import com.farhanryanda.tugasdatabinding.databinding.NewsItemBinding

class NewsAdapter(var listNews: ArrayList<News>) : RecyclerView.Adapter<NewsAdapter.ViewHolder>() {
    class ViewHolder(val binding: NewsItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun data(itemData: News) {
            binding.news = itemData
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = NewsItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.data(listNews[position])
        holder.binding.cvNews.setOnClickListener {
            val detailNewsFragment = DetailNewsFragment()
            val bundle = Bundle()
            bundle.putSerializable("news", listNews[position])
            detailNewsFragment.arguments = bundle
            var activity: AppCompatActivity = holder.itemView.context as AppCompatActivity
            activity.supportFragmentManager.beginTransaction()
                .replace(R.id.fc_main, detailNewsFragment)
                .addToBackStack(null)
                .commit()
        }
    }

    override fun getItemCount(): Int = listNews.size

    fun setDataNews(list: ArrayList<News>) {
        this.listNews = list
    }
}