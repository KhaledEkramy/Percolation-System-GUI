# Percolation System GUI

## Overview

The "Percolation System GUI" project is designed to provide a graphical user interface (GUI) for visualizing and interacting with the Percolation System. The core functionality is implemented in the Java class `Percolation`.

## Features

- **Interactive Grid Display:** Visualize the percolation system through an interactive grid where each cell represents a site.

- **Real-time Simulation:** Simulate percolation processes by opening sites and observing the system's dynamic behavior.

- **Visual Feedback:** Identify full sites to understand the percolation status visually.

- **Parameter Adjustment:** Adjust system parameters, such as grid size (`n`), to explore different percolation configurations.

- **Statistical Information:** View real-time data, including the number of open sites, to track system evolution.


## Repository Structure

- **src:** Contains the Java source code, including the `Percolation` class and potentially additional classes for GUI implementation.
  
- **docs:** Documentation explaining the percolation algorithm, GUI functionalities, and usage instructions.", 'which is going to be included in the following Percolation class ``The core class for the Application``.

- **resources:** Graphical assets or resources used in the GUI.


### Percolation Class API

#### Constructor

```java
/**
 * Creates a Percolation object for a grid of specified size.
 * @param n Size of the grid (n x n).
 * @throws IllegalArgumentException if n is less than or equal to 0.
 */
public Percolation(int n);
```

#### Open Method

```java
/**
 * Opens a site at the specified row and column if it is not already open.
 * @param row Row index (1-based).
 * @param col Column index (1-based).
 * @throws IndexOutOfBoundsException if the site is out of bounds.
 */
public void open(int row, int col);
```

#### Is Open Method

```java
/**
 * Checks if a site at the specified row and column is open.
 * @param row Row index (1-based).
 * @param col Column index (1-based).
 * @return true if the site is open, false otherwise.
 * @throws IndexOutOfBoundsException if the site is out of bounds.
 */
public boolean isOpen(int row, int col);
```

#### Is Full Method

```java
/**
 * Checks if a site at the specified row and column is full.//Means having a mutual connection with any element in top row.
 * @param row Row index (1-based).
 * @param col Column index (1-based).
 * @return true if the site is full, false otherwise.
 * @throws IndexOutOfBoundsException if the site is out of bounds.
 */
public boolean isFull(int row, int col);
```

#### Number of Open Sites Method

```java
/**
 * Gets the number of open sites in the grid.
 * @return Number of open sites.
 */
public int numberOfOpenSites();
```

#### Percolates Method

```java
/**
 * Checks if the system percolates (there is a path from the top to the bottom).
 * @return true if the system percolates, false otherwise.
 */
public boolean percolates();
```

#### Random Integer Method

```java
/**
 * Generates a random integer between 0 (inclusive) and n (exclusive).
 * @param n Upper bound (exclusive) for the random integer.
 * @return A random integer.
 * @throws IllegalArgumentException if n is less than or equal to 0.
 */
public static int uniformInt(int n);
```

## Usage

- **Education:** Suitable for students, researchers, or enthusiasts interested in percolation theory for educational exploration.

## Contributing

Feel free to contribute to the project by forking the repository and creating pull requests.
