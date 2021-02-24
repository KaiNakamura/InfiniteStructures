[![License: MIT](https://img.shields.io/badge/License-MIT-brightgreen.svg)](https://github.com/KaiNakamura/InfiniteStructures/blob/master/LICENSE)
[![maven](https://github.com/KaiNakamura/InfiniteStructures/workflows/maven/badge.svg)](https://github.com/KaiNakamura/InfiniteStructures/actions)
[![downloads](https://img.shields.io/github/downloads/KaiNakamura/InfiniteStructures/total)](https://github.com/KaiNakamura/InfiniteStructures/releases)

<p align="center">
	<h1 align="center">Infinite Structures</h1>
	<h2 align="center">
		Generate Infinite Structures in Your Minecraft World
		<br />
		<a href="https://github.com/KaiNakamura/InfiniteStructures/issues">Report Bug</a>
		·
		<a href="#installation"><b>INSTALLATION INSTRUCTIONS</b></a>
	</h2>
</p>

## Table of Contents

* [About](#about)
* [Installation](#installation)
* [Setup](#setup)
* [Issues](#issues)
* [License](#license)

## About

This project is a spigot plugin that allows you to generate infinite structures in your minecraft world.

## Installation

Download the latest version from [releases](https://github.com/KaiNakamura/InfiniteStructures/releases) and place the JAR file in the plugins folder of your server.

## Setup

To start generating infinite structures, load the plugin and navigate to the [config.yml](https://github.com/KaiNakamura/InfiniteStructures/blob/master/src/main/resources/config.yml) file in the plugins folder of your server under `InfiniteStructures\config.yml`

This plugin allows you to change the following structures:
* Village
* Desert Pyramid
* Igloo
* Jungle Pyramid
* Swamp Hut
* Pillager Outpost
* Monument
* Endcity
* Mansion
* Ruined Portal
* Shipwreck
* Ocean Ruin
* Bastion Remnant
* Fortress
* Nether Fossil

Each structure has the following configuration options:

| Option | Description | Notes |
| --- | --- | --- |
| `spacing` | Average distance between two structure placement attempts of this type in chunks | |
| `separation` | Minimum distance between two structures of this type in chunks | MUST be less than `spacing` |
| `salt` | A number that assists in randomization | See [salt (cryptography)](https://en.wikipedia.org/wiki/Salt_(cryptography)) |

Leaving a number blank will set it to its default value. To infinitely repeat a structure, use `2` for `spacing` and `1` for `separation`. For more details see the [minecraft wiki](https://minecraft.gamepedia.com/Custom#Generator_types).

Changes take effect upon generating a world. To reset the world delete the `world`, `world_nether`, and `world_the_end` folders of your server.

## Issues

To report a bug or to request a feature go [here](https://github.com/KaiNakamura/InfiniteStructures/issues).

## License

Distributed under the [MIT License](https://github.com/KaiNakamura/InfiniteStructures/blob/master/LICENSE).
