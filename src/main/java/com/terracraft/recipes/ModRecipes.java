package com.terracraft.recipes;

public class ModRecipes
{
    public ModRecipes()
    {
    }

    public static void initAll()
    {
        ModRecipesFurnace.initRecipes();
        ModRecipesWorkbench.initRecipes();
    }
}
