package org.arcanium.game.node.entity.player.link.diary;

import org.arcanium.game.node.item.Item;

/**
 * An achievement diary type.
 *
 * @author Vexia
 * @author Splinter
 */
public enum DiaryType {
    KARAMJA("Karamja", 13, new String[][]{{"Pick 5 bananas from the plantation located east of the <br><br>volcano.", "Use the rope swing to travel to the small island north-west<br><br>of Karamja, where the moss giants are.", "Mine some gold from the rocks on the north-west<br><br>peninsula of Karamja.", "Travel to Port Sarim via the dock, east of Musa Point.", "Travel to Ardougne via the port near Brimhaven.", "Explore Cairn Island to the west of Karamja.", "Use the Fishing spots north of the banana plantation.", "Collect 5 seaweed from anywhere on Karamja.", "Attempt the TzHaar Fight Pits or Fight Cave.", "Kill a Jogre in the Pothole dungeon."}, {"Claim a ticket from the Agility arena in Brimhaven.", "Discover hidden wall in the dungeon below the volcano.", "Visit the Isle of Crandor via the dungeon below the volcano.", "Use Vigroy and Hajedy's cart service.", /*
* "Earn 100% favour in the village of Tai Bwo Wannai Cleanup."
* ,
* "Cook a spider on a stick."
* ,
*//*
* "Charter the Lady of the Waves from Cairn Isle to Port Khazard."
* ,
*/
            "Cut a log from a teak tree.", "Cut a log from a mahogany tree.", /*
* "Catch a karambwan"
* ,
*//*
* "Exchange gems for a machete."
* ,
*/
            "Use the gnome glider to travel to Karamja.", "Grow a healthy fruit tree in the patch near Brimhaven.", /*
* "Trap a horned graahk."
* ,
*/
            "Chop the vines to gain deeper access to Brimhaven Dungeon.", "Cross the lava using the stepping stones within Brimhaven Dungeon.", "Climb the stairs within Brimhaven Dungeon.", /* "Charter a ship from the Shipyard in the far east of Karamja." */
            "Mine a red topaz from a gem rock."}, {"Become the Champion of the Fight Pits.", "Successfully kill a Ket-Zek in the Fight Caves.", /*
* "Eat an oomlie wrap."
* ,
*/
            "Craft some nature runes.", /*
* "Cook a karambwan thoroughly." ,
* "Kill a deathwing in the dungeon under the Kharazi Jungle."
* ,
* "Use the crossbow shortcut south of the volcano."
* ,* "Collect 5 palm leaves." ,
*/

            "Be assigned a Slayer task by Duradel in Shilo Village.", "Kill a metal dragon in Brimhaven Dungeon."}}, new Item[][]{{new Item(11136), new Item(11137)}, {new Item(11138), new Item(11139)}, {new Item(11140), new Item(11141)}}, "To start marking off tasks in your journal, speak to Pirate<br><br>Jackie the Fruit in Brimhaven, Kaleb Paramay in Shilo<br><br>Village or one of the Jungle Foresters north of the<br><br>Kharazi Jungle.", new int[]{1055, 512, 401}),


    VARROCK("Varrock", 14, new String[][]{{"Have Thessalia show you what outfits you can wear.", "Have Aubury teleport you to the essence mine.", "Mine some Iron in the south east mining patch near Varrock.", "Make a plank at the sawmill.", "Enter the second level of the Stronghold of Security.", "Jump over the fence south of Varrock.", "Chop down a dying tree in the Lumber Yard.", "Buy a newspaper.", "Give a dog a bone!", "Spin a bowl on the pottery wheel and fire it in the oven in <br><br>Barbarian Village.", "Craft some Earth runes.", "Catch some trout in the river Lum at Barbarian Village.", "Steal from the Tea stall in Varrock."}, {"Have the Apothecary in Varrock make you a strength potion.", "Enter the Champions Guild.", "Use the spirit tree north of Varrock", "Perform the 4 emotes from the Stronghold of Security.", "Cast the teleport to Varrock spell.", "Get a Slayer task from Vannaka", "Make 20 Mahogany Planks in one go."}, {"Make a Waka Canoe near Edgeville.", "Teleport to Barbarian Village with a skull sceptre.", "Chop some yew logs in Varrock and burn them at the top of<br><br> the Varrock church.", "Collect at least 2 yew roots from the Tree patch in Varrock Palace.", "Pray at the altar in Varrock palace with Smite active.", "Squeeze through the obstacle pipe in Edgeville dungeon."}}, new Item[][]{{new Item(11756), new Item(11185)}, {new Item(11757), new Item(11186)}, {new Item(11758), new Item(11187)}}, "", new int[]{5833, 2660, 1597}),

    LUMBRIDGE("Lumbridge", 2, new String[][]{
            {"Slay a cave bug in the Lumbridge Swamp Caves", "Have Sedridor teleport you to the Rune essence mine", "Craft some water runes", "Pickpocket a man or woman in lumbridge", "Chop and burn some oak logs in Lumbridge", "Kill a zombie in the Draynor Sewers (level 13 only)", "Catch some anchovies in Al-Kharid", "Bake some bread on the Lumbridge kitchen range", "Mine some iron ore at the Al-Kharid mine", "Enter the H.A.M. Hideout"},
            {"Purchase an upgraded device from Ava", "Travel to the Wizards' Tower by fairy ring", "Cast the Lumbridge Teleport spell", "Catch some salmon in Lumbridge", "Craft a coif in the Lumbridge cow pen", "Chop some willow logs in Draynor Village", "Pickpocket Martin the Master Gardener", "Get a slayer task from Chaeldar", "Catch an essence or electic impling in Puro-Puro", "Craft some lava runes at the Fire altar in Al Kharid"},
            {"Smith a mithril platebody on the anvil in the Draynor Sewers", "Craft 56 cosmic runes simultaneously", "Travel from Lumbridge to Edgeville on a waka canoe", "Purchase some barrows gloves from the Culinaromancer's Chest", "Pick some belladonna from the farming patch at Draynor manor"}
    }, new Item[][]{{new Item(13560), new Item(11185)}, {new Item(13561), new Item(11186)}, {new Item(13562), new Item(11187)}}, "", new int[]{7969, 519, 743});

//TODO: What the fuck happened with the formatting above
/*GLOBAL("Global", 15, new String[][] { {
"Successfully harvest from a farming patch.", "Rub a Genie's lamp and make a wish.", "Successfully cook a Swordfish whilst wearing a chef's hat.",
"Purchase a new grave from Father Aereck in <br><br>Lumbridge.", "Challenge another player to a friendly duel.",  "Obtain a Mystery box from killing any monster.", "Trick Hans into believing you're a murderer.",
"Successfully pickpocket a Guard.","Complete a run in the Sorceress' Garden without being<br><br>caught.", "Embarass a sheep by taking its wool.", "Watch the Wise Old Man break into the Draynor bank.",
"Raise the flag atop the Lumbridge castle.", "Use the Gnome Glider services to travel across the world."
}, {
"Catch a Ninja impling.", "Worship the Ectofuntus with bonemeal and a bucket of<br><br>slime.", "Complete a Slayer task from any master.", "Successfully pickpocket a Paladin.",
"Hatch a Chameleon egg in an incubator.","Use the Stat spy spell to inspect another player's levels.","Convert your Teak logs into planks at the Sawmill.", "Steal from the ancient chest in the Barrows minigame.",
"Release a Barbarian Spirit by burning a Pyre ship.", "Cast the Fruit bat familiar's special move.", "Use the Taverly dungeon pipe squeeze shortcut."
}, {
"Complete a game of Pest Control in the veteran<br><br>lander.", "Create a set of Dragon arrows with Fletching.", "Perform a Skillcape emote.", "Make a super strong weapon poison potion.",
"Claim a Quest Point cape from the Wise Old Man in<br><br>Draynor.", "Grapple across to the Armadyl section of the Godwars<br><br>dungeon.", "Defeat a Revenant in the Wilderness.",
"Mine a rock of Runite.", "Achieve a 'rare' drop that sends a server-wide message to all <br><br>players.", "Complete any level 3 clue scroll.",
"Bang on the big door in the Godwars dungeon.", "Cut an Onyx.", "Make a Rune scimitar with the Smithing skill.", "Perform the Air guitar emote.",
} },
new Item[][] { { new Item(6199), new Item(11185) }, { new Item(11757), new Item(11186) }, { new Item(11758), new Item(11187) } }, "", new int[] {  })*/;

    /**
     * The name of the diary.
     */
    private final String name;

    /**
     * The child id.
     */
    private final int child;

    /**
     * The achievement descriptions.
     */
    private final String[][] achievements;

    /**
     * The item rewards.
     */
    private final Item[][] rewards;

    /**
     * The info to start the diary.
     */
    private final String info;

    /**
     * The npcs for the task levels.
     */
    private final int[] npcs;

    /**
     * Constructs a new {@code DiaryType} {@code Object}
     *
     * @param name         the name of the diary.
     * @param child        the child id.
     * @param achievements the achievements.
     * @param rewards      the rewards.
     * @param info         the info about the diary.
     * @param npcs         the npcs for the task levels.
     */
    private DiaryType(String name, int child, String[][] achievements, Item[][] rewards, String info, int[] npcs) {
        this.name = name;
        this.child = child;
        this.achievements = achievements;
        this.rewards = rewards;
        this.info = info;
        this.npcs = npcs;
    }

    /**
     * Gets the diary type for the child id.
     *
     * @param child the child.
     * @return the diary type.
     */
    public static DiaryType forChild(int child) {
        for (DiaryType type : values()) {
            if (type.getChild() == child) {
                return type;
            }
        }
        return null;
    }

    /**
     * Gets the npc for the level.
     *
     * @param level the level.
     * @return the npc id.
     */
    public int getNpc(int level) {
        return npcs[level];
    }

    /**
     * Gets the rewards for the task level.
     *
     * @param level the level.
     * @return the rewards.
     */
    public Item[] getRewards(int level) {
        return rewards[level];
    }

    /**
     * Gets the achievements for the task level.
     *
     * @param level the level.
     * @return the achievements.
     */
    public String[] getAchievements(int level) {
        return achievements[level];
    }

    /**
     * Gets the achievements.
     *
     * @return the achievements
     */
    public String[][] getAchievements() {
        return achievements;
    }

    /**
     * Gets the rewards.
     *
     * @return the rewards
     */
    public Item[][] getRewards() {
        return rewards;
    }

    /**
     * Gets the name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the info.
     *
     * @return the info
     */
    public String getInfo() {
        return info;
    }

    /**
     * Gets the child.
     *
     * @return the child
     */
    public int getChild() {
        return child;
    }

    /**
     * Gets the npcs.
     *
     * @return the npcs
     */
    public int[] getNpcs() {
        return npcs;
    }
}