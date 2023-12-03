# Merkle Madness

## Index
1. [Visual_Project_Description](#visual-project-descritipon)
1. [Project Overview](#project-overview)
2. [Project Summary](#project-summary)
3. [Project Details](#project-details)
4. [Key Methods and Responsibilities](#key-methods-and-responsibilities)

## Visual Project Descritipon:

![blockchain](https://github.com/NoahBakayou/MerkleConquestCS294/assets/100172278/69067d51-e6bf-457d-8ebf-99ce73337b4b)
![blockchain2](https://github.com/NoahBakayou/MerkleConquestCS294/assets/100172278/76f98085-ecc4-47de-bd29-321a93543524)

## Project Overview

This collaborative project provides hands-on coding experience with multithreading and Merkle roots. It serves as an opportunity to reinforce essential skills related to SHA256 Hashing, Merkle trees, and Multithreading.

## Project Summary

The project introduces a console application that combines multithreading and Merkle roots in a simple game. Here's an overview of how the game works:

1. **User Input**: The user starts by entering the Merkle root of four words they intend to provide to the Merkle thread. The Merkle root can be manually calculated using a provided method or an online tool.

2. **Multithreading**: The application employs multithreading, allowing the user to submit strings on the main thread. Each submitted string is grabbed by either a Merkle or Rogue background thread, depending on the timing of the user.

3. **Merkle Thread**: If the Merkle thread successfully gathers four words, it creates a Merkle tree and generates a Merkle root string. If this root matches the initially entered Merkle root, the user wins the game. Otherwise, they lose.

4. **Rogue Thread**: The Rogue thread is responsible for accumulating "strikes" every time it grabs a word. If the user accumulates three strikes, they lose the game.

5. **Random Delays**: Both background threads introduce an element of randomness by sleeping for a random number of seconds. This challenge requires the user to time their submissions correctly to ensure the Merkle thread grabs the words.

6. **Monitor Thread**: A third Monitor thread in the background constantly checks the progress and terminates the application once the user either wins or loses.

## Project Details

- **Console Application**: This project is designed as a console application.
- **User Input**: To facilitate user input, it's recommended to use JOptionPane rather than System.in, as the latter can be problematic due to interactions with the threads.
- **Classes**: The project consists of several classes, including `MerkleManager_Test`, `MerkleManager`, `MerkleThread`, `RogueThread`, `MonitorThread`, `MerkleNode`, and `Util`.

## Key Methods and Responsibilities

- **MerkleManager_Test**: Contains the main method, instantiates an instance of `MerkleManager`, and calls the `manage` function.

- **MerkleManager**: Manages the game and contains instance variables for user input and game state. It starts three separate threads: `MerkleThread`, `RogueThread`, and `MonitorThread`. It also handles user input for words.

- **MerkleThread**: Implements Runnable, collects words, and calculates the Merkle root when enough words are collected.

- **RogueThread**: Implements Runnable, simulates a rogue thread that accumulates strikes when grabbing words.

- **MonitorThread**: Implements Runnable, constantly monitors game progress and terminates the app when the user either wins or loses.

- **MerkleNode**: Represents nodes in the Merkle tree, with instance variables for hash, left, and right nodes.

- **Util**: Contains utility methods shared among classes, such as calculating the Merkle root, generating hashes, prompting the user, and introducing random delays in threads.

