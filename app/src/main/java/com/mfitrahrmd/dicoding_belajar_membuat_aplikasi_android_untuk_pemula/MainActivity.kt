package com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import android.widget.AdapterView.OnItemClickListener
import android.widget.Toast
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.databinding.ActivityMainBinding
import com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.databinding.ItemHeroBinding

class HeroAdapter(val heroes: ArrayList<Hero>) : RecyclerView.Adapter<HeroAdapter.HeroVH>() {

    private var _onItemClick: ((hero: Hero, position: Int) -> Unit)? = null

    fun setOnItemClick(onItemClick: (hero: Hero, position: Int)  -> Unit) {
        _onItemClick = onItemClick
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroVH {
        val itemHeroBinding = ItemHeroBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return HeroVH(itemHeroBinding)
    }

    override fun getItemCount(): Int {
        return heroes.size
    }

    override fun onBindViewHolder(holder: HeroVH, position: Int) {
        with(holder) {
            with(heroes[position]) {
                Glide.with(holder.itemView.context).load(photo).into(itemHeroBinding.imgItemPhoto)
                itemHeroBinding.tvItemName.text = name
                itemHeroBinding.tvItemDescription.text = description

                itemView.setOnClickListener {
                    _onItemClick?.let { click -> click(this, position) }
                }
            }
        }
    }

    class HeroVH(val itemHeroBinding: ItemHeroBinding) : RecyclerView.ViewHolder(itemHeroBinding.root)
}

class MainVM : ViewModel() {
    val heroes: ArrayList<Hero> = arrayListOf(
        Hero("Soekarno", "the number one", "https://upload.wikimedia.org/wikipedia/commons/0/01/Presiden_Sukarno.jpg"),
        Hero("Soeharto", "the number two", "https://upload.wikimedia.org/wikipedia/commons/5/59/President_Suharto%2C_1993.jpg"),
        Hero("Habibie", "the number three", "https://id.wikipedia.org/wiki/B._J._Habibie#/media/Berkas:B._J._Habibie,_President_of_Indonesia_portrait.jpg"),
        Hero("Gusdur", "the number four", "https://upload.wikimedia.org/wikipedia/commons/3/35/President_Abdurrahman_Wahid_-_Indonesia.jpg"),
        Hero("Megawati", "the number five", "https://upload.wikimedia.org/wikipedia/commons/9/9f/Megawati_Sukarnoputri_official_portrait.jpg"),
    )
}

class MainActivity : AppCompatActivity() {
    private lateinit var _mainBinding: ActivityMainBinding
    private lateinit var _mainVM: MainVM

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(_mainBinding.root)
        _mainVM = ViewModelProvider.NewInstanceFactory().create(MainVM::class.java)

        with(_mainBinding.rvHeroes) {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@MainActivity)
            val heroAdapter = HeroAdapter(_mainVM.heroes)
            heroAdapter.setOnItemClick { hero, position ->
                Toast.makeText(this@MainActivity, "The name is ${hero.name}", Toast.LENGTH_SHORT).show()
            }
            adapter = heroAdapter
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.actionList -> {
                _mainBinding.rvHeroes.layoutManager = LinearLayoutManager(this@MainActivity)
            }
            R.id.actionGrid -> {
                _mainBinding.rvHeroes.layoutManager = GridLayoutManager(this@MainActivity, 2)
            }
        }
        return super.onOptionsItemSelected(item)
    }
}