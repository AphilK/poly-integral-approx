# Polynomial Integral Approximation

A Java console application that implements numerical methods for polynomial interpolation and integral approximation. Currently features Lagrange polynomial interpolation with planned support for trapezoid and Simpson integration methods.

## Features

- **Lagrange Polynomial Interpolation**: Calculate polynomial values using Lagrange interpolation method
- Interactive console-based user interface
- Input validation and error handling
- Detailed calculation tables with formatted output
- Support for custom data point sets

## Mathematical Background

### Lagrange Polynomial Interpolation

The Lagrange interpolation method constructs a polynomial that passes through a given set of points. For a set of n+1 data points (x₀, y₀), (x₁, y₁), ..., (xₙ, yₙ), the Lagrange polynomial is defined as:

```
P(x) = Σ(i=0 to n) yi * Li(x)
```

Where Li(x) is the i-th Lagrange basis polynomial:

```
Li(x) = Π(j=0 to n, j≠i) (x - xj) / (xi - xj)
```

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Any Java IDE or text editor (VS Code recommended)

### Installation

1. Clone this repository:
   ```bash
   git clone https://github.com/AphilK/poly-integral-approx.git
   cd poly-integral-approx
   ```

2. Compile the Java source code:
   ```bash
   javac -d bin src/PolynomialIntegralApproximation.java
   ```

3. Run the application:
   ```bash
   java -cp bin PolynomialIntegralApproximation
   ```

## Usage

### Running the Application

When you start the program, you'll see a menu with the following options:

```
Please choose an option:
1 - Find the lagrange polynomial
2 - Solve an integral using the trapezoid method (Coming Soon)
3 - Solve an integral using the simpson method (Coming Soon)
4 - Leave
```

### Lagrange Polynomial Interpolation

1. Select option `1` from the main menu
2. Enter your x-values (independent variables), type 'e' when finished
3. Enter your corresponding y-values (function values), type 'e' when finished
4. Enter the value of t where you want to evaluate the polynomial
5. The program will display a detailed calculation table and the result

#### Example Usage

```
Please enter the values of x. Type 'e' to exit.
1.0
2.0
3.0
e

Now enter the values of f(x). type 'e' to exit.
2.0
8.0
18.0
e

Please enter the value of t to calculate the lagrange polynomial: 1.5
```

The program will output a detailed table showing the calculation process and the final interpolated value.

### Input Validation

- The program ensures that the number of x-values matches the number of y-values
- The interpolation point t must be within the range of provided x-values
- Invalid inputs are handled gracefully with error messages

## Project Structure

```
poly-integral-approx/
├── README.md                           # This file
├── src/
│   └── PolynomialIntegralApproximation.java  # Main application source
├── bin/                                # Compiled class files
│   └── PolynomialIntegralApproximation.class
└── lib/                                # Dependencies (currently empty)
```

## Technical Details

### Code Features

- **Modular Design**: Clean separation between user interface and mathematical calculations
- **Error Handling**: Comprehensive input validation using try-catch blocks
- **Formatted Output**: Results displayed with 10 decimal places precision
- **Dynamic Data Structures**: Uses ArrayList for flexible data point management
- **Interactive Console**: User-friendly menu-driven interface

### Key Methods

- `main(String[] args)`: Application entry point and main menu loop
- `lagrange(ArrayList<Double> x, ArrayList<Double> y, double t)`: Implements Lagrange interpolation algorithm

## Future Enhancements

- [ ] Implement trapezoid rule for numerical integration
- [ ] Implement Simpson's rule for numerical integration
- [ ] Add support for reading data points from files
- [ ] Implement additional interpolation methods (Newton, Spline)
- [ ] Add graphical visualization of polynomials
- [ ] Support for higher-order derivatives

## Contributing

Contributions are welcome! Please feel free to submit a Pull Request. For major changes, please open an issue first to discuss what you would like to change.

### Development Setup

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## License

This project is open source and available under the [MIT License](LICENSE).

## Author

**AphilK** - [GitHub Profile](https://github.com/AphilK)

## Acknowledgments

- Lagrange interpolation method based on classical numerical analysis techniques
- Inspired by numerical methods courses in computational mathematics
