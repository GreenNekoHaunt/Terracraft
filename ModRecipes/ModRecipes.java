package Terracraft.ModRecipes;

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