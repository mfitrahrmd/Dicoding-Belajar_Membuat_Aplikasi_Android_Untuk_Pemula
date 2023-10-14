package com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Canvas
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.adapters.CharacterListAdapter
import com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.data.Buff
import com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.data.Character
import com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.data.Skill
import com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.data.Skin
import com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.data.Weapon
import com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.databinding.ActivityCharacterListBinding

class CharacterListActivity : AppCompatActivity() {
    private lateinit var _characterListBinding: ActivityCharacterListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _characterListBinding = ActivityCharacterListBinding.inflate(layoutInflater)
        setContentView(_characterListBinding.root)
        setSupportActionBar(_characterListBinding.appToolbar)

        with(_characterListBinding.rvCharacters) {
            val characterListAdapter = CharacterListAdapter(arrayListOf(
                Character(
                    "Knight",
                    listOf("burst damage"),
                    "The Knight is the first playable character, being the default character unlocked at the start of the game. He wears silver armor with a red bandana scarf wrapped around his neck.",
                    6,
                    5,
                    180,
                    4,
                    R.color.knight,
                    Buff("No extra damage when shield is broken", "https://static.wikia.nocookie.net/soul-knight/images/8/88/BuffShieldBuffer.png/"),
                    listOf(
                        Skin("Default", "https://static.wikia.nocookie.net/soul-knight/images/4/44/Knight_0.gif/", "https://static.wikia.nocookie.net/soul-knight/images/8/8c/Knight_0_art.png/"),
                        Skin("Vermillion", "https://static.wikia.nocookie.net/soul-knight/images/1/16/Knight_16.gif/", "https://static.wikia.nocookie.net/soul-knight/images/1/1a/Knight_16_art.png/"),
                    ),
                    listOf(
                        Weapon("Bad Pistol", "Handgun", 3, 0, 0, 5, "https://static.wikia.nocookie.net/soul-knight/images/2/2b/Knight_0_starter_unupgrade.png/"),
                        Weapon("Inferno", "Handgun", 4, 2, 0, 5, "https://static.wikia.nocookie.net/soul-knight/images/1/19/Knight_16_starter.png/"),
                    ),
                    listOf(
                        Skill("Dual Wield", "https://static.wikia.nocookie.net/soul-knight/images/2/27/Knight's.png/", "Wield the current weapon in both hands for a short duration.", "- The Knight will bring out a second copy of the current weapon for 5 seconds. During the skill duration, both weapons can be fired with a minor time difference. Each copy will consume energy.\n- During the skill duration, the basic melee attack will also be performed twice."),
                        Skill("Superior Fire", "https://static.wikia.nocookie.net/soul-knight/images/a/a9/Knight's2.png/", "Wield all weapons in the stock simultaneously for a short duration.", "- The Knight will bring out all weapons in possession for 5 seconds. During the skill duration, each attack will use both weapons with a minor time difference. Energy will still be consumed accordingly.\n- If trying to attack at melee range, the Knight will also perform the basic melee attack if there is any non-melee weapon in use. This can still happen even if the Knight is also holding any melee weapon."),
                        Skill("Chaotic Strike", "https://static.wikia.nocookie.net/soul-knight/images/a/a9/Knight's3.png/", "For a short duration, inflict a random effect on enemies hit by your weapons.", "- While active, all weapon attacks become imbued with a \"chaotic\" element, such that they can trigger random effects. Effects may be triggered upon collision.\n- If an attack was already launched during skill duration, it will carry the effect until it disappears. On the other hand, existing attacks do not get imbued if they were launched before skill activation. This can be seen with Magic Staff series and continuous laser weapons.")
                    ),
                    "The Knight has one of the highest health of all characters. He is hard to kill, and his energy is average as compared to other characters, which makes him very suitable for starting players. His starting buff also greatly increases his defensive capabilities. However, his damage output depends solely on his weapon, and unlike more specialized glass cannons, he is no answer when it comes to evasion, relying solely on shock and awe to suppress enemies or even bosses before they can threaten him.",
                    listOf("You go, I'm taking a break", "Talk to my hand!", "They never shut the fridge door")
                )
            ))

            characterListAdapter.setOnItemClickCallback { c ->
                startActivity(Intent(this@CharacterListActivity, CharacterDetailActivity::class.java).putExtra(CharacterDetailActivity.EXTRA_CHARACTER, c))
            }

            adapter = characterListAdapter

            layoutManager = LinearLayoutManager(this@CharacterListActivity)
            addItemDecoration(object : RecyclerView.ItemDecoration() {
                @SuppressLint("UseCompatLoadingForDrawables")
                override fun onDraw(c: Canvas, parent: RecyclerView, state: RecyclerView.State) {
                    super.onDraw(c, parent, state)
                    val divider = getDrawable(R.drawable.list_character_divider)

                    divider?.draw(c)
                }
            })
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)

        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // TODO : go to about page

        return super.onOptionsItemSelected(item)
    }
}