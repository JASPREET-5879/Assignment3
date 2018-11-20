package com.example.jassk.myapplication;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {



        //Member variable
       MainActivity c;

        @Before
        public void setUp() throws Exception {

            //Initialized member variable
            c = new MainActivity();
        }

        // TEST CASES FOR ADDITION

        @Test
        // Test Identifier: 1.1
        // Test Description: Adding 5 and 5 (2 positive numbers)
        // Method of Execution: Automated
        // Input Data: 5,5
        // Expected Output: 10.0
        // Observed Output: 10.0

        public void testAddition_input5and5_output10() throws Exception {
            // 1. Arrange
            double i = 5;
            double j = 5;

            // 2. Act
            double result = c.addition(i, j);

            // 3. Assert
            assertEquals(10.0, result,1);
        }


        // TEST CASES FOR SUBTRACTION

        @Test
        // Test Identifier: 2.1
        // Test Description: Subtracting 10 from 8 (2 positive numbers)
        // Method of Execution: Automated
        // Input Data: 10,8
        // Expected Output: 2.0

        public void testSubtraction_10and8_2() throws Exception {
            // 1. Arrange
            double i = 10;
            double j = 8;

            // 2. Act
            double result = c.subtraction(i, j);

            // 3. Assert
            assertEquals(2.0, result,1);
        }



        @Test
        // Test Identifier: 2.3
        // Test Description: Subtracting 0 from 0
        // Method of Execution: Automated
        // Input Data: 0,0
        // Expected Output: 0.0

        public void testSubtraction_0and0_0() throws Exception {
            // 1. Arrange
            double i = 0;
            double j = 0;

            // 2. Act
            double result = c.subtraction(i, j);

            // 3. Assert
            assertEquals(0.0, result,1);
        }

        @Test
        // Test Identifier: 2.4
        // Test Description: Subtracting 0.25 from 0 (subtracting from zero)
        // Method of Execution: Automated
        // Input Data: 0.25,0
        // Expected Output: 0.25


        public void testSubtraction_0andNegativePoint25_Point25() throws Exception {
            // 1. Arrange
            double i = 0;
            double j = -0.25;

            // 2. Act
            double result = c.subtraction(i, j);

            // 3. Assert
            assertEquals(0.25, result,1);
        }

        @Test
        // Test Identifier: 2.5
        // Test Description: Subtracting 3 from -7
        // Method of Execution: Automated
        // Input Data: 3,-7
        // Expected Output: -10.0

        public void testSubtraction3_negative7and3_negative10() throws Exception {
            // 1. Arrange
            double i = -7;
            double j = 3;

            // 2. Act
            double result = c.subtraction(i, j);

            // 3. Assert
            assertEquals(-10, result,1);
        }


        // TEST CASES FOR MULTIPLICATION

        @Test
        // Test Identifier: 3.1
        // Test Description: Multiplying 200 by 2
        // Method of Execution: Automated
        // Input Data: 200,2
        // Expected Output: 400.0

        public void testMultiplication_200And2_400() throws Exception {
            // 1. Arrange
            double i = 200;
            double j = 2;

            // 2. Act
            double result = c.multiplication(i, j);

            // 3. Assert
            assertEquals(400.0, result,1);
        }

        @Test
        // Test Identifier: 3.2
        // Test Description: Multiplying -15 by -3
        // Method of Execution: Automated
        // Input Data: -15,-3
        // Expected Output: 45.0

        public void testMultiplication_Negative15_Negative3_Positive45() throws Exception {
            // 1. Arrange
            double i = -15;
            double j = -3;

            // 2. Act
            double result = c.multiplication(i, j);

            // 3. Assert
            assertEquals(45.0, result,1);
        }




        @Test
        // Test Identifier: 3.5
        // Test Description: Multiplying 0 by 0
        // Method of Execution: Automated
        // Input Data: 0,0
        // Expected Output: -35.0

        public void testMultiplication_0and0_0() throws Exception {
            // 1. Arrange
            double i = 0;
            double j = 0;

            // 2. Act
            double result = c.multiplication(i, j);

            // 3. Assert
            assertEquals(0.0, result,1);
        }


        // TEST CASES FOR DIVISION

        @Test
        // Test Identifier: 4.1
        // Test Description: Dividing 20 by 5
        // Method of Execution: Automated
        // Input Data: 20,5
        // Expected Output: 0

        public void testDivision_20and5_4() throws Exception {
            // 1. Arrange
            double i = 20;
            double j = 5;

            // 2. Act
            double result = c.division(i, j);

            // 3. Assert
            assertEquals(4.0, result,1);
        }


        @Test
        // Test Identifier: 4.2
        // Test Description: Dividing 0 by 3
        // Method of Execution: Automated
        // Input Data: 0,3
        // Expected Output: 0.0

        public void testDivision_0And3_0() throws Exception {
            // 1. Arrange
            double i = 0;
            double j = 3;

            // 2. Act
            double result = c.division(i, j);

            // 3. Assert
            assertEquals(0.0, result,1);
        }




        @Test
        // Test Identifier: 4.4
        // Test Description: Dividing 39 by 13
        // Method of Execution: Automated
        // Input Data: 39,13
        // Expected Output: 3.0

        public void testDivision_Negative39andPositive13_Negative3() throws Exception {
            // 1. Arrange
            double i = -39;
            double j = 13;

            // 2. Act
            double result = c.division(i, j);

            // 3. Assert
            assertEquals(-3.0, result,1);
        }

        @Test
        // Test Identifier: 4.5
        // Test Description: Dividing 49 by -7
        // Method of Execution: Automated
        // Input Data: 49,-7
        // Expected Output: -7.0

        public void testDivision_Positive49000AndNegative7000_Negative7() throws Exception {
            // 1. Arrange
            double i = 49000;
            double j = -7000;

            // 2. Act
            double result = c.division(i, j);

            // 3. Assert
            assertEquals(-7.0, result,1);
        }
    @Test
    // Test Identifier: 4.2
    // Test Description: Dividing 1 by 1
    // Method of Execution: Automated
    // Input Data: 1,1
    // Expected Output: 1.0

    public void testDivision_1And1_1() throws Exception {
        // 1. Arrange
        double i = 1;
        double j = 1;

        // 2. Act
        double result = c.division(i, j);

        // 3. Assert
        assertEquals(1.0, result,1);
    }

    @Test
    // Test Identifier: 4.2
    // Test Description: Dividing 2 by 1
    // Method of Execution: Automated
    // Input Data: 2,1
    // Expected Output: 2.0

    public void testDivision_2And1_1() throws Exception {
        // 1. Arrange
        double i = 2;
        double j = 1;

        // 2. Act
        double result = c.division(i, j);

        // 3. Assert
        assertEquals(2.0, result,1);
    }
    @Test
    // Test Identifier: 4.2
    // Test Description: Dividing 9 by 3
    // Method of Execution: Automated
    // Input Data: 9,3
    // Expected Output: 3

    public void testDivision_9And3_3() throws Exception {
        // 1. Arrange
        double i = 9;
        double j = 3;

        // 2. Act
        double result = c.division(i, j);

        // 3. Assert
        assertEquals(3, result,1);
    }

    }

