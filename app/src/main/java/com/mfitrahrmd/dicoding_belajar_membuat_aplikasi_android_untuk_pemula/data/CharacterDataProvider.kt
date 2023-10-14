package com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.data

import com.mfitrahrmd.dicoding_belajar_membuat_aplikasi_android_untuk_pemula.R

object CharacterDataProvider {
    val allCharacters: List<Character> = listOf(
        Character(
            "Knight",
            listOf("dps"),
            "The Knight is the first playable character, being the default character unlocked at the start of the game. He wears silver armor with a red bandana scarf wrapped around his neck.",
            6,
            5,
            180,
            4,
            R.color.knight,
            Buff(
                "No extra damage when shield is broken",
                "https://static.wikia.nocookie.net/soul-knight/images/8/88/BuffShieldBuffer.png/"
            ),
            listOf(
                Skin(
                    "Gray Knight",
                    "https://static.wikia.nocookie.net/soul-knight/images/4/44/Knight_0.gif/",
                    "https://static.wikia.nocookie.net/soul-knight/images/8/8c/Knight_0_art.png/"
                ),
                Skin(
                    "Vermillion",
                    "https://static.wikia.nocookie.net/soul-knight/images/1/16/Knight_16.gif/",
                    "https://static.wikia.nocookie.net/soul-knight/images/1/1a/Knight_16_art.png/"
                ),
            ),
            listOf(
                Weapon(
                    "Bad Pistol",
                    "Handgun",
                    3,
                    0,
                    0,
                    5,
                    "https://static.wikia.nocookie.net/soul-knight/images/2/2b/Knight_0_starter_unupgrade.png/"
                ),
                Weapon(
                    "Inferno",
                    "Handgun",
                    4,
                    2,
                    0,
                    5,
                    "https://static.wikia.nocookie.net/soul-knight/images/1/19/Knight_16_starter.png/"
                ),
            ),
            listOf(
                Skill(
                    "Dual Wield",
                    "Wield the current weapon in both hands for a short duration.",
                    "- The Knight will bring out a second copy of the current weapon for 5 seconds. During the skill duration, both weapons can be fired with a minor time difference. Each copy will consume energy.\n- During the skill duration, the basic melee attack will also be performed twice.",
                    "https://static.wikia.nocookie.net/soul-knight/images/2/27/Knight's.png/"
                ),
                Skill(
                    "Superior Fire",
                    "Wield all weapons in the stock simultaneously for a short duration.",
                    "- The Knight will bring out all weapons in possession for 5 seconds. During the skill duration, each attack will use both weapons with a minor time difference. Energy will still be consumed accordingly.\n- If trying to attack at melee range, the Knight will also perform the basic melee attack if there is any non-melee weapon in use. This can still happen even if the Knight is also holding any melee weapon.",
                    "https://static.wikia.nocookie.net/soul-knight/images/a/a9/Knight's2.png/"
                ),
                Skill(
                    "Chaotic Strike",
                    "For a short duration, inflict a random effect on enemies hit by your weapons.",
                    "- While active, all weapon attacks become imbued with a \"chaotic\" element, such that they can trigger random effects. Effects may be triggered upon collision.\n- If an attack was already launched during skill duration, it will carry the effect until it disappears. On the other hand, existing attacks do not get imbued if they were launched before skill activation. This can be seen with Magic Staff series and continuous laser weapons.",
                    "https://static.wikia.nocookie.net/soul-knight/images/a/a9/Knight's3.png/"
                )
            ),
            "The Knight has one of the highest health of all characters. He is hard to kill, and his energy is average as compared to other characters, which makes him very suitable for starting players. His starting buff also greatly increases his defensive capabilities. However, his damage output depends solely on his weapon, and unlike more specialized glass cannons, he is no answer when it comes to evasion, relying solely on shock and awe to suppress enemies or even bosses before they can threaten him.",
            listOf(
                "You go, I'm taking a break",
                "Talk to my hand!",
                "They never shut the fridge door"
            )
        ),
        Character(
            "Rogue",
            listOf("dash", "critical"),
            "The Rogue is a playable character. He is a redhead wearing a turquoise cloak over a rogue suit.",
            5,
            3,
            180,
            5,
            R.color.rogue,
            Buff(
                "Critical hit bullets can pierce enemies",
                "https://static.wikia.nocookie.net/soul-knight/images/7/7a/BuffCritPierce.png/"
            ),
            listOf(
                Skin(
                    "Green Scarf",
                    "https://static.wikia.nocookie.net/soul-knight/images/f/fe/Rogue_0.gif/",
                    "https://static.wikia.nocookie.net/soul-knight/images/7/7b/Rogue_0_art.png/"
                ),
                Skin(
                    "Falcon",
                    "https://static.wikia.nocookie.net/soul-knight/images/e/e4/Rogue_15.gif/",
                    "https://static.wikia.nocookie.net/soul-knight/images/e/e6/Rogue_15_art.png/"
                ),
                Skin(
                    "Yulong",
                    "https://static.wikia.nocookie.net/soul-knight/images/d/db/Rogue_16.gif/",
                    "https://static.wikia.nocookie.net/soul-knight/images/b/bd/Rogue_16_art.png/"
                )
            ),
            listOf(
                Weapon(
                    "Jack and Mary",
                    "Throwing",
                    4,
                    1,
                    0,
                    0,
                    "https://static.wikia.nocookie.net/soul-knight/images/9/98/Sprite_Jack_and_Mary.png/"
                ),
                Weapon(
                    "Winged Long",
                    "Throwing",
                    4,
                    1,
                    0,
                    0,
                    "https://static.wikia.nocookie.net/soul-knight/images/c/c4/Rogue_7_starter.png/"
                ),
                Weapon(
                    "Drizzle Sword & Thunder Spear",
                    "Throwing",
                    4,
                    1,
                    0,
                    0,
                    "https://static.wikia.nocookie.net/soul-knight/images/c/cb/Rogue_16_starter.png/"
                ),
            ),
            listOf(
                Skill(
                    "Dodge",
                    "Roll forward and dodge all enemy bullets.",
                    "- Dodge moves Rogue forward in the direction where he is facing.\n- Dodge causes Rogue to evade and ignore all hostile damage for 0.5 seconds.",
                    "https://static.wikia.nocookie.net/soul-knight/images/7/73/Rogue's.png/"
                ),
                Skill(
                    "Iaido",
                    "Dash towards enemies and slash them.",
                    "- Quickly dashes forward by 10 tiles, aiming towards the target. Enemies caught in the dash will receive 8 damage.\n- Rogue is invulnerable during the dash.",
                    "https://static.wikia.nocookie.net/soul-knight/images/e/e9/Rogue's2.png/"
                ),
                Skill(
                    "Cartwheel",
                    "Roll forward and inflict collision damage on enemies on the way. Perform a slash at the end of the cartwheel.",
                    "- When holding the skill button, Rogue will roll in the current or last direction of the player's direction pad and can bounce off walls if the D-pad is not being touched.\n- While rolling, Rogue will be invincible, unable to use weapons, and deal 5 contact damage to enemies (10 on critical hits).",
                    "https://static.wikia.nocookie.net/soul-knight/images/5/5b/Rogue's3.png/"
                ),
            ),
            "The Rogue has one of the lowest armor of all characters, which makes his gameplay quite unforgiving. His skills partially make up for this, however. His energy is average, and since his special ability forces movement, it is imperative that he obtains efficient weapons. He also has the second-highest melee damage and critical chance.",
            listOf("Wait till I finish this episode.", "New anime! Dai suki!", "I want a big TV.")
        ),
        Character(
            "Witch",
            listOf("control", "magic burst"),
            "The Witch is a playable character. She appears to be an amaranth-haired female wearing a bandana scarf of the same color, with a rust brown cloak and pointed hat. She also appears to wear a black blouse and boots.",
            3,
            5,
            240,
            3,
            R.color.witch,
            Buff(
                "Elemental bullets deal double damage on critical hit. Staff weapon deal higher damage.",
                "https://static.wikia.nocookie.net/soul-knight/images/6/65/BuffElementalStaff.png/"
            ),
            listOf(
                Skin(
                    "Amaranth",
                    "https://static.wikia.nocookie.net/soul-knight/images/e/ea/Witch_0.gif/",
                    "https://static.wikia.nocookie.net/soul-knight/images/3/38/Witch_0_art.png/"
                ),
                Skin(
                    "Peafowl Princess",
                    "https://static.wikia.nocookie.net/soul-knight/images/9/94/Witch_17.gif/",
                    "https://static.wikia.nocookie.net/soul-knight/images/7/7b/Witch_17_art.png/"
                ),
                Skin(
                    "Cassandra",
                    "https://static.wikia.nocookie.net/soul-knight/images/2/2c/Witch_18.gif/",
                    "https://static.wikia.nocookie.net/soul-knight/images/1/1b/Witch_18_art.png/"
                )
            ),
            listOf(
                Weapon(
                    "The Code",
                    "Staff",
                    3,
                    1,
                    0,
                    0,
                    "https://static.wikia.nocookie.net/soul-knight/images/c/c9/Witch_0_starter_unupgrade.png/"
                ),
                Weapon(
                    "Floral Feather Fan",
                    "Staff",
                    3,
                    1,
                    0,
                    0,
                    "https://static.wikia.nocookie.net/soul-knight/images/a/a3/Witch_17_starter.png/"
                ),
                Weapon(
                    "Heart of the Ocean",
                    "Staff",
                    3,
                    1,
                    0,
                    0,
                    "https://static.wikia.nocookie.net/soul-knight/images/7/70/Witch_18_starter.png/"
                ),
            ),
            listOf(
                Skill(
                    "Lightning Strike",
                    "Releases a powerful lightning strike that damages, stuns, and inflicts electro-charged effects on enemies. Lighting channels up to 4 times among targets.",
                    "- The Witch will swing a Magic Staff and create a blue circle underneath her, then a lightning bolt will strike the nearest enemy in sight. The bolt can then jump to other enemies up to 4 times.\n- While the first target has to be in line of sight and not behind indestructible blocks, the following jumps will ignore obstacles.",
                    "https://static.wikia.nocookie.net/soul-knight/images/f/fa/Witch's.png/"
                ),
                Skill(
                    "Piercing Frost",
                    "Cast frost spikes that freeze and deal damage to enemies. Frost spikes can block bullets.",
                    "- Summon one trail of 6 ice spikes that travels forward, damaging and Freezing enemies.\n- The ice trail can also block bullets and travel through obstacles. However, enemy bouncy bullets cannot be blocked.",
                    "https://static.wikia.nocookie.net/soul-knight/images/7/7a/Witch's2.png/"
                ),
                Skill(
                    "Firestorm",
                    "Cast a firestorm that sweeps across the whole room. Fireballs have a chance to burn enemies. Max 6 fireballs.",
                    "- The Witch summons fireballs that circle the player for 5 seconds. The number of fireballs depends on how many charges the skill has.\n- It can also travel through solid obstacles and can destroy destructible blocks.",
                    "https://static.wikia.nocookie.net/soul-knight/images/6/65/Witch's3.png/"
                ),
            ),
            "The Witch has the lowest critical hit chance of all characters. Her energy is as high as it gets for non-legendary characters, so she can carry weapons with high energy consumption without much fear of running out of it. Her armor is high, but her health is low, making it hard to lose health but also making it more problematic when it does happen.",
            listOf(
                "I can feel the magic recovering.",
                "Books are a uniquely portable magic."
            )
        ),
        Character(
            "Assassin",
            listOf("dash", "critical"),
            "The Assassin is a playable character. He wears a cool cod gray and milano red suit with a bandana of the same color (somewhat resembling a ninja) and has saffron-buttercup eyes.",
            4,
            4,
            180,
            5,
            R.color.assassin,
            Buff(
                "Melee weapons can bounce bullets",
                "https://static.wikia.nocookie.net/soul-knight/images/6/63/BuffMeleeReflect.png/"
            ),
            listOf(
                Skin(
                    "Red Shadow",
                    "https://static.wikia.nocookie.net/soul-knight/images/0/03/Assassin_0.gif/",
                    "https://static.wikia.nocookie.net/soul-knight/images/3/39/Assassin_0_art.png/"
                ),
                Skin(
                    "Techno Cat",
                    "https://static.wikia.nocookie.net/soul-knight/images/6/6c/Assassin_2.gif/",
                    null
                ),
                Skin(
                    "Six-eared Macaque",
                    "https://static.wikia.nocookie.net/soul-knight/images/0/00/Assassin_16.gif/",
                    "https://static.wikia.nocookie.net/soul-knight/images/e/e5/Assassin_16_art.png/"
                ),
            ),
            listOf(
                Weapon(
                    "Blood Blade",
                    "Melee",
                    6,
                    0,
                    0,
                    0,
                    "https://static.wikia.nocookie.net/soul-knight/images/3/3f/Sprite_Blood_Blade.png/"
                ),
                Weapon(
                    "Techno Blade",
                    "Melee",
                    6,
                    0,
                    0,
                    0,
                    "https://static.wikia.nocookie.net/soul-knight/images/6/6d/Assassin_0_starter_purity.png/"
                ),
                Weapon(
                    "Free Spirit Steelbaston",
                    "Melee",
                    6,
                    0,
                    0,
                    0,
                    "https://static.wikia.nocookie.net/soul-knight/images/e/e6/Assassin_16_starter.png/"
                ),
            ),
            listOf(
                Skill(
                    "Dark Blade",
                    "Perform a powerful slash. You won't take a hit when you speed up. Defeating an enemy resets the CD (up to 5 times).",
                    "- Increases Movement speed by +5.\n- The Assassin is immune to all damage and can bypass projectiles until the skill ends normally, or 1 second after a kill.",
                    "https://static.wikia.nocookie.net/soul-knight/images/1/15/Assassin's.png/"
                ),
                Skill(
                    "Doppelgänger",
                    "Create a duplicate that assist you in the fight.",
                    "- he Assassin throws a cosmetic smoke bomb on the ground and spawns a clone of himself with the currently held weapon.\n- The clone will disappear after receiving enough damage and will not persist through floors.",
                    "https://static.wikia.nocookie.net/soul-knight/images/1/11/Assassin's2.png/"
                ),
                Skill(
                    "Invisibility",
                    "Turn invisible together with allies nearby. The next attack will be more powerful.",
                    "- When the skill is used, Assassin and all nearby players, Pets and Followers will undergo a short animation and become invisible, enemies cannot directly target them in this state.\n- The invisibility lasts for 6 seconds maximum but ends if the Assassin attacks.",
                    "https://static.wikia.nocookie.net/soul-knight/images/6/60/Assassin's3.png/"
                )
            ),
            "The Assassin has slightly lower health yet slightly higher armor than the other heroes which makes him vulnerable when taking damage. His energy is average, so watch out for highly energy consuming weapons.",
            listOf("Be careful out there", "Spacious lobby!")
        ),
        Character(
            "Alchemist",
            listOf("magic dps"),
            "The Alchemist is a playable character. He appears to be wearing a brown hooded robe and a cadet blue bandana, with a tank of poison strapped to his back.",
            5,
            5,
            180,
            4,
            R.color.alchemist,
            Buff(
                "Immune to poison gas and slow effect, increase poison damage to mosters",
                "https://static.wikia.nocookie.net/soul-knight/images/4/43/BuffImmunePoison.png/"
            ),
            listOf(
                Skin(
                    "Toxin",
                    "https://static.wikia.nocookie.net/soul-knight/images/4/40/Alchemist_0.gif/",
                    "https://static.wikia.nocookie.net/soul-knight/images/0/08/Alchemist_0_art.png/"
                ),
                Skin(
                    "DJ",
                    "https://static.wikia.nocookie.net/soul-knight/images/4/49/Alchemist_1.gif/",
                    null
                ),
            ),
            listOf(
                Weapon(
                    "Dormant Bubble Machine",
                    "Shotgun",
                    2,
                    2,
                    15,
                    3,
                    "https://static.wikia.nocookie.net/soul-knight/images/9/9c/Sprite_Dormant_Bubble_Machine.png/"
                ),
                Weapon(
                    "Dormant Bubble Machine",
                    "Shotgun",
                    2,
                    2,
                    15,
                    3,
                    "https://static.wikia.nocookie.net/soul-knight/images/9/9c/Sprite_Dormant_Bubble_Machine.png/"
                ),
            ),
            listOf(
                Skill(
                    "Gas Grenade",
                    "Throw bottles filled with poisonous gas, which inflict AoE damage and slows down enemies. Enemies will be poisoned over time.",
                    "- After 3 stacks of the poison effect, enemies will take higher damage and infect enemies nearby.\n- The Alchemist throws a single bottle forward. When the bottle hits any crate, wall, or enemy, it breaks and creates a green poison gas pool that lasts for 6 seconds.",
                    "https://static.wikia.nocookie.net/soul-knight/images/5/56/Alchemist's.png/"
                ),
                Skill(
                    "Elemental Potions",
                    "hrow out a Gas/Fire/Freeze potion in turn, which inflict AoE damage. Chance to poison/burn/freeze enemies.",
                    "Throws a bottle Alch Potion that creates a Poison/Fire/Freeze pool upon landing. Each thrown bottle will have only one element, and they cycle in that order.",
                    "https://static.wikia.nocookie.net/soul-knight/images/a/a6/Alchemist's2.png/"
                ),
                Skill(
                    "Concoction",
                    "Concoct a potion that has an unknown effect. After you take it, you can gain a buff for a short duration.",
                    "- The Alchemist will be equipped with a Red/Legendary bottle named \"Concoction.\" Each use of the skill will add a random ingredient into the bottle. Each bottle can contain up to 3 ingredients.\n- Ingredients have different effects. They are also affected by Potion Effectiveness Buff",
                    "https://static.wikia.nocookie.net/soul-knight/images/0/02/Alchemist's3.png/"
                )
            ),
            "The Alchemist's HP and armor are both on the high side. Most characters have less in one of the two stats. His other base stats are average.",
            listOf("Want a drink?", "I got two new flavours.", "Which flavour shall I pick today?")
        ),
        Character(
            "Elf",
            listOf("critical"),
            "The Elf icon Elf is a playable character. She wears a jade green and yellow cloak over a dark green shirt. She also wears a green bandana with a yellow outline and a hairpiece of the same color. She has light golden long hair that waves and blue eyes.",
            5,
            4,
            180,
            4,
            R.color.elf,
            Buff(
                "Shorter charge time for weapons that require charging",
                "https://static.wikia.nocookie.net/soul-knight/images/0/0a/BuffChargeSpeed.png/"
            ),
            listOf(
                Skin(
                    "Brave Hunter",
                    "https://static.wikia.nocookie.net/soul-knight/images/b/b0/Elf_0.gif/",
                    "https://static.wikia.nocookie.net/soul-knight/images/4/45/Elf_0_art.png/"
                ),
                Skin(
                    "Bifang Bird",
                    "https://static.wikia.nocookie.net/soul-knight/images/7/74/Elf_7.gif/",
                    null
                ),
                Skin(
                    "Apricot Fairy",
                    "https://static.wikia.nocookie.net/soul-knight/images/e/e0/Elf_13.gif/",
                    "https://static.wikia.nocookie.net/soul-knight/images/e/e8/Elf_13_art.png/"
                ),
            ),
            listOf(
                Weapon(
                    "Ancient Bow",
                    "Bow",
                    8,
                    2,
                    50,
                    0,
                    "https://static.wikia.nocookie.net/soul-knight/images/1/1d/Sprite_Ancient_Bow.png/"
                ),
                Weapon(
                    "Ancient Bow",
                    "Bow",
                    8,
                    2,
                    50,
                    0,
                    "https://static.wikia.nocookie.net/soul-knight/images/9/97/Elf_7_starter.png/"
                ),
                Weapon(
                    "Apricot Bow",
                    "Bow",
                    8,
                    2,
                    50,
                    0,
                    "https://static.wikia.nocookie.net/soul-knight/images/c/c8/Elf_13_starter.png/"
                ),
            ),
            listOf(
                Skill(
                    "Focus Fire",
                    "Auto-aim or manually aim at enemies and fire Magic Arrows.",
                    "- Elf gains a bonus of 25% critical chance.\n- The Elf cannot move or be moved by pushing or knockback nor interact with NPCs, objects.",
                    "https://static.wikia.nocookie.net/soul-knight/images/e/e5/Elf's.png/"
                ),
                Skill(
                    "Arrow Rain",
                    "Cast a volley of arrows to deal AoE damage.",
                    "- Fires a volley of up to 14 energy arrows in a large radius.\n- These arrows deal 5 damage each and can create an area of effect that damage enemies.",
                    "https://static.wikia.nocookie.net/soul-knight/images/9/97/Elf's2.png/"
                ),
                Skill(
                    "Guardian Elf",
                    "Summon a guardian elf to assist you in a fight.",
                    "- Once used, it will summon a Guardian Elf cycling through these three elves: Fire, Wind, and Water.",
                    "https://static.wikia.nocookie.net/soul-knight/images/6/64/Elf's3.png/"
                ),
            ),
            "The Elf has moderate health (6) and moderately low armor (5) so she can tank at most one blast. Her starter weapon, Ancient Bow, synergizes with her passive buff, making a powerful stun combo.",
            listOf("Stay awhile and listen.", "What's for dinner?")
        ),
        Character(
            "Werewolf",
            listOf("regen", "durable"),
            "The Werewolf is a playable character. He has slate grey skin and slanted eyes, and wears a light brown wolf jumpsuit.",
            11,
            1,
            120,
            5,
            R.color.werewolf,
            Buff(
                "Immune to traps, and immune to collision damage",
                "https://static.wikia.nocookie.net/soul-knight/images/c/cd/BuffImmuneTrap.png/"
            ),
            listOf(
                Skin(
                    "Lone Wolf",
                    "https://static.wikia.nocookie.net/soul-knight/images/6/6e/Werewolf_0.gif/",
                    null
                ),
                Skin(
                    "Wolverine",
                    "https://static.wikia.nocookie.net/soul-knight/images/2/24/Werewolf_1.gif/",
                    null
                ),
            ),
            listOf(
                Weapon(
                    "Flaring Claw",
                    "Misc",
                    5,
                    0,
                    25,
                    0,
                    "https://static.wikia.nocookie.net/soul-knight/images/0/00/Sprite_Flaring_Claw.png/"
                ),
                Weapon(
                    "Flaring Claw",
                    "Misc",
                    5,
                    0,
                    25,
                    0,
                    "https://static.wikia.nocookie.net/soul-knight/images/0/00/Sprite_Flaring_Claw.png/"
                ),
            ),
            listOf(
                Skill(
                    "Berserk",
                    "Go berserk, and attack with claws. You can deal more damage as you lose health. Going berserk with low health restores your health.",
                    "- After a short transformation process, the Werewolf transforms into a wolf for 5 seconds.\n- In this form, the Werewolf moves faster than usual.",
                    "https://static.wikia.nocookie.net/soul-knight/images/e/ee/Werewolf's.png/"
                ),
                Skill(
                    "Blood Thirst",
                    "Slash enemies with claws in a quick succession. Hitting enemies restores health.",
                    "Werewolf lunges forward, performing a combo of melee attacks.\n- During the skill, Werewolf is in his transformed state and takes 1/3 damage, rounded down.",
                    "https://static.wikia.nocookie.net/soul-knight/images/1/1d/Werewolf's2.png/"
                ),
                Skill(
                    "Devour",
                    "Devour an enemy and restore health and energy. CD shortens if your attempted attack misses.",
                    "- Werewolf lunges forward and then devours any enemies nearby, gaining health and energy.",
                    "https://static.wikia.nocookie.net/soul-knight/images/7/78/Werewolf's3.png/"
                ),
            ),
            "The Werewolf has the highest health and the lowest armor, such that almost every single attack can break through it, though this is often offset somewhat by his great access to healing skills.",
            listOf(
                "I want to try my luck on that gashapon machine again",
                "Power surging...",
                "Moonlight transforms me!"
            )
        ),
        Character(
            "Priestess",
            listOf("regen", "buff"),
            "The Priestess is a playable character. She has blonde hair, aqua eyes, and is wearing a white hooded robe.",
            3,
            5,
            200,
            3,
            R.color.priestess,
            Buff(
                "Improve potion effectiveness",
                "https://static.wikia.nocookie.net/soul-knight/images/5/5d/BuffPotionEffectiveness.png/"
            ),
            listOf(
                Skin(
                    "Holy White",
                    "https://static.wikia.nocookie.net/soul-knight/images/3/3d/Priestess_0.gif/",
                    null
                ),
                Skin(
                    "Boyi the Valor",
                    "https://static.wikia.nocookie.net/soul-knight/images/a/ae/Priestess_7.gif/",
                    null
                ),
                Skin(
                    "Virgo",
                    "https://static.wikia.nocookie.net/soul-knight/images/3/3d/Priestess_17.gif/",
                    "https://static.wikia.nocookie.net/soul-knight/images/a/a3/Priestess_17_art.png/"
                ),
            ),
            listOf(
                Weapon(
                    "Wooden Cross",
                    "Staff",
                    4,
                    2,
                    0,
                    5,
                    "https://static.wikia.nocookie.net/soul-knight/images/f/fe/Sprite_Wooden_Cross.png/"
                ),
                Weapon(
                    "Boyi Wooden Cross",
                    "Staff",
                    4,
                    2,
                    0,
                    5,
                    "https://static.wikia.nocookie.net/soul-knight/images/8/88/Priestess_7_starter.png/"
                ),
                Weapon(
                    "Stellar Whisper",
                    "Staff",
                    4,
                    2,
                    0,
                    5,
                    "https://static.wikia.nocookie.net/soul-knight/images/f/f1/Priestess_17_starter.png/"
                ),
            ),
            listOf(
                Skill(
                    "Regeneration Pact",
                    "Cast a pact that restores the health of you and allies.",
                    "- Heals 1 HP to characters up to 3 times for 2 seconds.\n- Restores 5 HP per tick for pets and followers.",
                    "https://static.wikia.nocookie.net/soul-knight/images/b/b2/Priestess'.png/"
                ),
                Skill(
                    "Pray",
                    "Restores the health and armor of all friendly units nearby, and increase movement speed and attack speed.",
                    "- While the blessing aura is in effect, targets will have their movement speed increased by +2 and their fire rate by 30%.\n- The Pray's effect covers a 20 tiles radius area around the Priestess.",
                    "https://static.wikia.nocookie.net/soul-knight/images/3/34/Priestess'2.png/"
                ),
                Skill(
                    "Moon Shadow",
                    "Continue to shoot moonlight missiles and shadow missiles.",
                    "- Moonlight missile: prioritized to heal friendly units.\n- Shadow missile: chance to burn enemies on hit.",
                    "https://static.wikia.nocookie.net/soul-knight/images/7/7f/Priestess'3.png/"
                ),
            ),
            "The Priestess has good armor and energy, but bad health and melee damage.",
            listOf("Follow the right path.", "You are trendy!")
        ),
        Character(
            "Druid",
            listOf("summoner"),
            "The Druid is a playable character. He has two deer antlers, jade eyes, and long white hair. He also wears a green cloak with the bone necklace in the middle.",
            6,
            3,
            130,
            5,
            R.color.druid,
            Buff(
                "Increase the effectiveness of pets and followers",
                "https://static.wikia.nocookie.net/soul-knight/images/a/ae/BuffPet.png/"
            ),
            listOf(
                Skin(
                    "Lone Druid",
                    "https://static.wikia.nocookie.net/soul-knight/images/4/4d/Druid_0.gif/",
                    null
                ),
                Skin(
                    "Buck Man",
                    "https://static.wikia.nocookie.net/soul-knight/images/f/f0/Druid_14.gif/",
                    "https://static.wikia.nocookie.net/soul-knight/images/d/d1/Druid_14_art.png/"
                ),
            ),
            listOf(
                Weapon(
                    "Crispy Bone",
                    "Throwing",
                    6,
                    1,
                    14,
                    5,
                    "https://static.wikia.nocookie.net/soul-knight/images/1/16/Sprite_Crispy_Bone.png/"
                ),
                Weapon(
                    "Staff of Conduct",
                    "Throwing",
                    6,
                    1,
                    14,
                    5,
                    "https://static.wikia.nocookie.net/soul-knight/images/8/86/Druid_14_starter.png/"
                ),
            ),
            listOf(
                Skill(
                    "Summon Wolves",
                    "Summon 2 wolves to assist you in the fight. After that, release the skill again to perform a melee-attack that marks the enemy on hit. Wolves will jump in the marked target to deal damage.",
                    "- Each wolf has 25 health. Wolves are indestructible, but they will rest for 30 seconds after HP depletion.\n- If the wolves have already been summoned, using the skill will cause Druid to perform a melee attack.",
                    "https://static.wikia.nocookie.net/soul-knight/images/9/9b/Druid's.png/"
                ),
                Skill(
                    "Vine",
                    "Summon vines to block bullets and attack enemies.",
                    "- Summon 6 vines from the ground around Druid.\n- Each vine has 9 health.\n- Every 3.5 seconds, each vine will shoot 8 green bullets in 8 directions.",
                    "https://static.wikia.nocookie.net/soul-knight/images/9/92/Druid's2.png/revision/"
                ),
                Skill(
                    "Fuzzy Bear",
                    "Summon a big bear and hop on it. To let the best fight independently, release the skill again. Attacks from the bear inflict AoE damage. When you are riding the bear, it takes damage for you.",
                    "- The Druid can use the skill button to dismount the bear.\n- When mounted, the bear takes all damage for the Druid, and only attacks when very close to enemies.",
                    "https://static.wikia.nocookie.net/soul-knight/images/5/5d/Druid's3.png/"
                ),
            ),
            "The Druid is somewhat healthy and good at melee. However, he lacks armor and energy.",
            listOf("I love fluffy animals and greens.", "I will tend the bonsai with love.")
        ),
        Character(
            "Necromancer",
            listOf("summoner"),
            "The Necromancer is a playable character. She has indigo hair that covers her forehead and eyes, an abnormally pale skin color, dark pink lipstick and two curved horns.",
            3,
            5,
            240,
            4,
            R.color.necromancer,
            Buff(
                "Decrease monster bullet speed, larger pickup radius",
                "https://static.wikia.nocookie.net/soul-knight/images/a/ac/BuffSlowBullets.png/"
            ),
            listOf(
                Skin(
                    "Dark Majesty",
                    "https://static.wikia.nocookie.net/soul-knight/images/8/8b/Necromancer_0.gif/",
                    null
                ),
                Skin(
                    "Cassiopeia",
                    "https://static.wikia.nocookie.net/soul-knight/images/1/11/Necromancer_12.gif/",
                    "https://static.wikia.nocookie.net/soul-knight/images/0/02/Necromancer_12_art.png/"
                ),
            ),
            listOf(
                Weapon(
                    "Staff of Plague",
                    "Staff",
                    1,
                    1,
                    0,
                    0,
                    "https://static.wikia.nocookie.net/soul-knight/images/4/4f/Sprite_Staff_of_Plague.png/"
                ),
                Weapon(
                    "Starfall Scepter",
                    "Staff",
                    1,
                    1,
                    0,
                    0,
                    "https://static.wikia.nocookie.net/soul-knight/images/c/ce/Necromancer_12_starter.png/"
                ),
            ),
            listOf(
                Skill(
                    "Nightmare",
                    "Tag an enemy. Defeating or dealing damage to the tagged enemy can summon a ghost to assist you in the fight.",
                    "- Using a staff identical to the Staff of Plague. Necromancer tags an enemy with a symbol.\n- By every 50 damage dealt to the marked enemy or upon killing it, an ally ghost hand will appear and attack other enemies. Multiple ghost hands can appear.",
                    "https://static.wikia.nocookie.net/soul-knight/images/0/04/Necromancer's.png/"
                ),
                Skill(
                    "Omen Stone",
                    "Summon an Omen Stone from the sky to inflict AoE damage. After it lands, it creates an area of plague in which a spider spawns. Infected enemies in the area will take damage over time.",
                    "- The spider won't attack, but it will create a circle of plague when it dies.\n- Upon the impact with the ground, Omen Stone will explode, dealing AoE damage and leaving behind an Area of Plague that has the same radius as the AoE explosion.",
                    "https://static.wikia.nocookie.net/soul-knight/images/1/13/Necromancer's2.png/"
                ),
                Skill(
                    "Souls Resurrect",
                    "Revive and buff up monsters to assist you in the fight. Starts with 1 monster to manipulate.",
                    "- Only when you are near a dead body can you release the skill.\n- Some special monsters can't be revived.",
                    "https://static.wikia.nocookie.net/soul-knight/images/4/48/Necromancer's3.png/"
                ),
            ),
            "The Necromancer has high armor and energy but lacks in health. However, she does possess decent Melee damage. Combined with her buff and starter weapon, she is good for short-ranged combat.",
            listOf("I took the path less traveled by.", "Can't deny that I do have a style.")
        ),
        Character(
            "Miner",
            listOf("burst damage"),
            "The Miner is a playable character. She wears a large mining helmet and a loose denim jumpsuit with a white shirt underneath.",
            5,
            4,
            200,
            4,
            R.color.miner,
            Buff(
                "Increase your max armor by 1 point when the number of coins reaches 100, 200 and 300",
                "https://static.wikia.nocookie.net/soul-knight/images/c/c6/BuffGoldArmor.png/"
            ),
            listOf(
                Skin(
                    "Gold Miner",
                    "https://static.wikia.nocookie.net/soul-knight/images/e/ee/Miner_0.gif/",
                    "https://static.wikia.nocookie.net/soul-knight/images/3/3d/Miner_0_art.png/"
                ),
                Skin(
                    "Chi Chi",
                    "https://static.wikia.nocookie.net/soul-knight/images/5/54/Miner_3.gif/",
                    "https://static.wikia.nocookie.net/soul-knight/images/8/8a/Miner_3_art.png/"
                ),
                Skin(
                    "Cetus",
                    "https://static.wikia.nocookie.net/soul-knight/images/5/53/Miner_4.gif/",
                    "https://static.wikia.nocookie.net/soul-knight/images/6/67/Miner_4_art.png/"
                ),
            ),
            listOf(
                Weapon(
                    "Pickaxe",
                    "Melee",
                    7,
                    0,
                    25,
                    0,
                    "https://static.wikia.nocookie.net/soul-knight/images/7/71/Sprite_Pickaxe.png/"
                ),
                Weapon(
                    "Colorful Toy Pickaxe",
                    "Melee",
                    7,
                    0,
                    25,
                    0,
                    "https://static.wikia.nocookie.net/soul-knight/images/6/6a/Miner_3_starter.png/"
                ),
                Weapon(
                    "Star Digger",
                    "Melee",
                    7,
                    0,
                    25,
                    0,
                    "https://static.wikia.nocookie.net/soul-knight/images/e/e6/Miner_4_starter.png/"
                ),
            ),
            listOf(
                Skill(
                    "Underground Operation",
                    "Miner drills a hole into the ground and disappears from there. She later breaks out of the soil, generating a shockwave to attack enemies and leaving a hole in the ground.",
                    "- Interact with the hole to transport yourself to the other one.\n- The Miner creates a large shockwave when entering/exiting the underground state.",
                    "https://static.wikia.nocookie.net/soul-knight/images/e/e4/Miner's.png/"
                ),
                Skill(
                    "Cart Delivery",
                    "Miner jumps on a mining cart and gradually accelerates, gaining a bonus to armor regeneration and defense based on the speed of the cart.",
                    "- ap the skill button again, and she will jump off the cart.\n- Movement speed increases over time as the cart accelerates, starting at 15, and capped at 30.",
                    "https://static.wikia.nocookie.net/soul-knight/images/0/0d/Miner's2.png/"
                ),
                Skill(
                    "Sandword Storm",
                    "Miner summons her sandworm friends that constantly surface around her to attack enemies.",
                    "- Sandworms, attack frequently and attack range will gradually increase.\n- After the first sandworm is summoned, an amount energy will be consumed every 1.5 seconds to maintain the summoning.",
                    "https://static.wikia.nocookie.net/soul-knight/images/0/0a/Miner's3.png/"
                ),
            ),
            "She is tanky and has armor increase/regen from her buff and skills, but she also can deal high amount of damage.",
            listOf(
                "The subterranean world has it all!! Trust me!",
                "I know a friend who like to hum and mine.",
                "I will never leave you alone, my drill.",
                "Sandworms? Cutie patooties.",
                "Uh... A hole in the floor? Wait, what is that...",
                "Ah... It was already there when I arrived! Trust me!",
                "There ain't no nothing stopping me drilling all the way through the dungeon!!!"
            )
        )
    )
}