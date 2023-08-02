package me.araacuteuwu.parkour;

import cn.nukkit.Player;
import cn.nukkit.plugin.PluginBase;

import java.util.ArrayList;
import java.util.List;

public class Main extends PluginBase {

    protected final List<String> setupMode = new ArrayList<>();

    @Override
    public void onEnable() {
        super.onEnable();
    }

    public boolean isInSetup (Player player) {
        return setupMode.contains(player.getName());
    }
}