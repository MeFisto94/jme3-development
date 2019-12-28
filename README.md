# jMonkeyEngine Development Stub
Drop-In Module for the jMonkeyEngine Repository to aid developing and having test-cases in-tree

---
## What is this?
This is a simple stub template, designed to be downloaded as a zip and extracted into a subfolder of your local checkout of the jMonkeyEngine (See below for precise instructions).

When Debugging the jMonkeyEngine one usually has a Test-Code Project and some Version of the Engine containing the Bug.
This means changing code in the engine requires a manual rebuild, copying jars over or using gradle install and then building the test project while ensuring it really picks up the new engine jars (which potentially have the same version, so you need `--refresh-dependencies`).

All in all, a very unpleasant situation. Here gradle's subprojects comes to the rescue. Setting this up can be tricky, though, as I first tried to add the engine as a subproject to my test project, which does not work. This is because the engine is a rootProject and thus cannot be added as a subproject for another rootProject.
What did work, though, is that one can drop in a small folder/module into the engine, containing the test code and executing it from there. This is what happens here.


## Installation Instructions
- Download this repository as a .zip (or clone it) as a subfolder of your local clone of `jMonkeyEngine/jmonkeyengine`. I recommend `jme3-development` as a name, though this is entirely irrelevant, you just need to adjust the name in the following steps then.
- Edit `settings.gradle` in the jMonkeyEngine root: Add `include 'jme3-development'` (preferrably as last line)
- (Optional) Edit `.gitignore` in the jMonkeyEngine root: Add `/jme3-development/`. This prevents jme3-development from acidentially becoming part of a contribution.

**Warning**: The above changes to `settings.gradle` and `.gitignore` will show as changes in your git tool. **DO NOT COMMIT THEM**. This is the only downside of this approach, you just need to be careful when commiting and switching branches (checkout) [here you need to stash changes or redo them after checking out a different branch]

## Usage Instructions
The following instructions have been tested for IntelliJ, but they also apply with changes to your favorite IDE or command-line:
- Open the Root Project (jMonkeyEngine Clone Directory)
- Open the `jme3-development` module and search for the Main Class (`com.jme3.development.Main`)
- Right-Click this class and select `Run Main.main()` (you need to be in `Production` view, not `Project`)
- Command Line users may have to specify the mainclass using the appropriate prefs
- Change the required modules in `build.gradle`, do note the `:` prefix and the absence of a version tag

----
(C) 2019 MeFisto94