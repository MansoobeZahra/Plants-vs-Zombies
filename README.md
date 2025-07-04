##  Project Report

###  Project Title
**Plants vs Zombies – Java Swing Clone**

###  Course
**Software Development**  
**Semester:** 04

###  Made by
- Mansoob-e-Zahra  


---

##  Objective

To replicate the core mechanics of the classic *Plants vs Zombies* game using **Java Swing**, emphasizing object-oriented principles, GUI development, multimedia integration, and real-time user interaction.

---

##  Tools & Technologies Used

- **Programming Language**: Java  
- **IDE**: VS Code / IntelliJ    i used vs code  
- **GUI Library**: Java Swing  
- **Multimedia**: Java Sound API  
- **Assets**: Custom icons, images, and sound effects for gameplay elements  
- **JDK**: Version 8 or above  

---

##  Core Programming Concepts Applied

- **Object-Oriented Programming (OOP)**:  
  - Class hierarchies for `Plant`, `Zombie`, `Projectile`, and `GamePanel`
  - Encapsulation, inheritance, and polymorphism for game logic and UI

- **Event-Driven Programming**:  
  - Mouse listeners for placing plants
  - Timer-based events for zombie movement and shooting

- **Java Swing GUI**:  
  - Utilized `JPanel`, `JFrame`, `Graphics`, `ImageIcon`, `Timer` for UI

- **Custom Game Loop**:  
  - Real-time updates to the screen using repaint cycles and timers

- **Multithreading** *(optional)*:  
  - Used for zombie movement or background music (if implemented)

---

##  Key Features

-  **Grid-Based Lawn**: Divides the screen into rows and columns for plant placement  
-  **Multiple Plant Types**: Each plant has unique behavior (e.g., shooter, sun producer)  
-  **Zombie AI**: Zombies spawn at intervals and automatically move toward the house  
-  **Projectiles**: Peashooters fire bullets at zombies, removing health on collision  
-  **Sound Effects**: Includes effects for shooting, zombie death, and game events  
-  **Graphical Interface**: Colorful visuals using image icons and background assets  
-  **Timed Events**: Uses `javax.swing.Timer` for controlled game speed  
-  **Win/Loss Logic**:  
  - Lose when a zombie reaches the house  
  - Win when all zombies are eliminated  
-  **Sun Collection Mechanism** *(if implemented)*:  
  - Suns fall randomly or via sunflower  
  - User collects suns to purchase plants  
-  **Restart & Quit Options**: Simple UI controls to restart or exit the game  
-  **Debug-Friendly Structure**: Modular code for easy testing and expansion  
-  **Collision Detection System**: Checks when bullets hit zombies and updates HP  
-  **Scoring System** *(optional)*: Tracks zombie kills or survival time  
-  **Splash Screen & Game Over Panel** *(optional)*  

---

##  Mathematical Concepts (If Required)

- **Graph Theory**:  
  - Grid-based board can be modeled as a graph for movement/pathfinding logic

- **Combinatorics**:  
  - Possible plant placement combinations  
  - Estimating game complexity based on wave generation and available sun

- **Boolean Logic**:  
  - Game conditions, win/lose checks, collision responses

- **Set Theory**:  
  - Representing active zombies, plants, and bullets as dynamic sets

---

##  Challenges Faced

- Synchronizing real-time events like zombie spawning and projectile movement  
- Maintaining consistent frame rate and UI responsiveness  
- Managing collisions and object cleanup after interactions  
- Aligning image scaling and asset layout with grid structure  
- Debugging event listeners for multiple concurrent UI actions  
- Sound file management without freezing GUI

---

##  Conclusion

This project demonstrates a practical application of core programming skills in building a real-time interactive game. It integrates Java GUI development with multimedia elements and object-oriented design. It was both a challenging and rewarding experience that deepened our understanding of how professional games are structured at a fundamental level.

---

