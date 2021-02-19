# Mutant Foods Mod
This mod adds mutant foods to minecraft! Specifically: Mutant Apples, Mutant Carrots, Mutant Cod and Mutant Steak
Along with this, also adds naturally generating uranium ore, uranium, uranium bits and unstable uranium

## Installation
This mod requires fabric 
1. Install fabric from their [official site](https://fabricmc.net/use/) and the [Fabric API](https://www.curseforge.com/minecraft/mc-mods/fabric-api)
2. Install the [Mutant Foods Mod](https://github.com/InfernalSpark/mutant-foods/releases/download/mc1.16.4-0.0.1/mutant-foods-0.0.1.jar)
3. Copy the Fabric API and the Mutant Foods Mod into the `.minecraft\mods` folder(create if non-existent)
4. Launch the Fabric verison of the game
5. Create a new world for the ore generation

## Usage
- Uranium ore will generate as rare as iron
- You can use any pickaxe to make it drop 2-4 Uranium Bits
- Using a silk touch pickaxe, you can mine it to get Uranium ore, which can be smelted to obtain Uranium(1 Uranium = 9 Uranium Bits)
- Smelt the Uranium Bits to obtain Unstable Uranium
- Surround any food(Apple, Carrot, Cooked Cod or Steak) with Unstable Uranium in a crafting table to create a Mutant Counterpart of that food
- Each Mutant food gives you special status effects

## Development
1. Download/Clone this repository
2. Open the downloaded folder in Visual Studio Code(preffered IDE)
3. Open a new terminal window in the folder
4. Run `./gradlew genSources` and `.\gradlew vscode` in the terminal
5. After finishing, run `./gradlew build` and locate the .jar file in `build/libs`

## Issues/Suggestions
Don't hesitate to open an issue if you have any suggestions or any bugs are found
