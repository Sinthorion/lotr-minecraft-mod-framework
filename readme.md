Lord of the Rings Framework
===========================

Introduction
------------
This project is an unofficial submod of the [Lord of the Rings Minecraft Mod](lotrminecraftmod.wikia.com). It aims to create an API or configuration protocol over which the features of the LOTR Mod can be used for custom worlds, such as the First Age or completely separate settings.

The mod is developed for Minecraft 1.7.10, Forge 7.99.40.1614, and the LOTR Mod 32.3.

Setup Instructions
------------------
As a Forge mod, this project uses Gradle for dependency management and build automatisation. The Gradle Wrapper is included in the repository.

The Lord of the Rings Mod is required for compilation. Get the latest version (currently 32.3) and place it in the `lib/` folder. A list of official downloads for all stable versions can be found [here](http://lotrminecraftmod.wikia.com/wiki/Updates).

### Building
To simply build the mod, run `gradlew build` on Windows or `./gradlew build` on Unix/Mac.

### Setup Development Environment
General help to set up a Forge development environment for all IDEs can be found online. Since the mod depends on the LOTR mod, you should place a copy of it in the `minecraft/mods/` directory. You also need a runtime deobfuscator. I recommend [CodeChickenCore](http://chickenbones.net/Pages/links.html). Download the "universal" version and place the .jar in `minecraft/mods/`.

Progress/Goals
--------------
Current version: early alpha stage

- [ ] World generation
  - [ ] Map file
  - [ ] Biome list
  - [ ] WorldType
  - [ ] Custom biomes
  - [ ] Waypoints
  - [ ] Roads
  - [ ] Worldgen features
- Items
  - [ ] Crafting tables
  - [ ] Banners
  - [ ] Horse Armour
  - [ ] Brewables
  - [ ] Chest loot
  - ...
- [ ] Factions
- [ ] NPCs
- [ ] Achievements
- ...

Credits/Contributors
--------------------
- Sinthorion (aka Pallando)