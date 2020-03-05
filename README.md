# Joern Workshop

This workshop consists of 3 modules covering various concepts around Interactive Code Analysis using [Joern](http://joern.io). We use VLC v3.0.7 as the primary target application along with a few memory allocation examples present in this repo. The workshop consists of 3 modules:

1. **Module 1 (Code Surfin’)** : Basic navigation and obtaining insights about code using Joern
2. **Module 2 (Memory Memoire)** : Explore and learn about possible memory allocation related bugs
3. **Module 3 (Scripting Away to Glory)**: Create reusable scripts from your analysis and build your own tools using Joern.

## Workshop Guide
Use the workshop presentation at Scale 18x `Finding-Stranger-Things-In-Code.pdf` as a guide to complete this workshop. The three modules are marked in the slides and contain all the commands presented in the workshop. You can directly copy/paste and run them on the Joern Shell.

## Preparation

* Clone Workshop Repo
  * https://github.com/tuxology/joern-workshop
  * `apt install source-highlight graphviz unzip`

* Download  joern-cli.zip and extract it in the workshop directory
  * https://github.com/ShiftLeftSecurity/joern/releases
  * `unzip joern-cli.zip`

* Download VLC v3.0.8 source and extract in workshop directory
  * `wget http://get.videolan.org/vlc/3.0.8/vlc-3.0.8.tar.xz`
  * `tar -xvf vlc-3.0.8.tar.xz`
