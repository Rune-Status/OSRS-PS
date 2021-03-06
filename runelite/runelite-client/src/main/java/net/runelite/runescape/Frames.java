package net.runelite.runescape;

import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.api.RSFrame;
import net.runelite.rs.api.RSFrames;

@ObfuscatedName("el")
@Implements("Frames")
public class Frames extends CacheableNode implements RSFrames {
    @ObfuscatedName("m")
    @ObfuscatedSignature(
            signature = "Lli;"
    )
    static IndexedSprite field1861;
    @ObfuscatedName("n")
    @ObfuscatedSignature(
            signature = "Liu;"
    )
    static Js5Index field1858;
    @ObfuscatedName("g")
    @ObfuscatedSignature(
            signature = "[Ldo;"
    )
    Frame[] skeletons;

    @ObfuscatedSignature(
            signature = "(Liu;Liu;IZ)V",
            garbageValue = "0"
    )
    public Frames(Js5Index var1, Js5Index var2, int var3, boolean var4) {
        Deque var5 = new Deque();
        int var6 = var1.method1574(var3);
        this.skeletons = new Frame[var6];
        int[] var7 = var1.method1524(var3);

        for (int var8 = 0; var8 < var7.length; ++var8) {
            byte[] var9 = var1.method1516(var3, var7[var8], 1789634852);
            FrameMap var10 = null;
            int var11 = (var9[0] & 255) << 8 | var9[1] & 255;

            for (FrameMap var12 = (FrameMap) var5.method4373(); var12 != null; var12 = (FrameMap) var5.method4358()) {
                if (var11 == var12.id) {
                    var10 = var12;
                    break;
                }
            }

            if (var10 == null) {
                byte[] var13 = var2.method1521(var11, 0);
                var10 = new FrameMap(var11, var13);
                var5.method4351(var10);
            }

            this.skeletons[var7[var8]] = new Frame(var9, var10);
        }

    }

    public RSFrame[] getFrames() {
        return this.skeletons;
    }

    @ObfuscatedName("g")
    @ObfuscatedSignature(
            signature = "(II)Z",
            garbageValue = "929319360"
    )
    public boolean method1087(int var1) {
        return this.skeletons[var1].showing;
    }
}
