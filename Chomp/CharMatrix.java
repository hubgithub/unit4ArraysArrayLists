// Implements a 2-D array of characters

public class CharMatrix
{
  // Instance variables:
  char[][] board;
  // Constructor: creates a grid with dimensions rows, cols,
  // and fills it with spaces
  public CharMatrix(int rows, int cols)
  {
    this.board = new char[rows][cols];
    for(int i = 0; i < rows; i ++)
    {
        for(int z = 0; z < cols; z++)
        {
            this.board[i][z] = ' ';
        }
    }
    
  }

  // Constructor: creates a grid with dimensions rows , cols ,
  // and fills it with the fill  character
  public CharMatrix(int rows, int cols, char fill)
  {
      this.board = new char[rows][cols];
      for(int i = 0; i < rows; i ++)
    {
        for(int z = 0; z < cols; z++)
        {
            this.board[i][z] = fill;
        }
    }
     
  }

  // Returns the number of rows in grid
  public int numRows()
  {
    return this.board.length;
  }

  // Returns the number of columns in grid
  public int numCols()
  {
    return this.board[0].length;
  }

  // Returns the character at row, col location
  public char charAt(int row, int col)
  {
    return this.board[row][col];

  }

  // Sets the character at row, col location to ch
  public void setCharAt(int row, int col, char ch)
  {
    this.board[row][col] = ch;
  }

  // Returns true if the character at row, col is a space,
  // false otherwise
  public boolean isEmpty(int row, int col)
  {
    boolean is = false;
    if(this.board[row][col] == ' ')
    {
        is = true;
    }
    return is;
  }

  // Fills the given rectangle with fill  characters.
  // row0, col0 is the upper left corner and row1, col1 is the
  // lower right corner of the rectangle.
  public void fillRect(int row0, int col0, int row1, int col1, char fill)
  {
    for(int i = row0; i <= row1; i++)
    {
        for(int z = col0; z <= col1;z++)
        {
            board[i][z] = fill;
        }
    }
  }

  // Fills the given rectangle with SPACE characters.
  // row0, col0 is the upper left corner and row1, col1 is the
  // lower right corner of the rectangle.
  public void clearRect(int row0, int col0, int row1, int col1)
  {
    for(int i = row0; i <= row1; i++)
    {
        for(int z = col0; z <= col1;z++)
        {
            board[i][z] = ' ';
        }
    }
  }

  // Returns the count of all non-space characters in row 
  public int countInRow(int row)
  {
    int count = 0;
      for(int i = 0; i < board[row].length; i++)
    {
        if(board[row][i] != ' ')
        {
        count++;
    }
    }
    return count;
  }

  // Returns the count of all non-space characters in col 
  public int countInCol(int col)
  {
    int count = 0;
    for(int i = 0; i < board.length; i++ )
    {
        if(board[i][col] != ' ')
        {
            count++;
        }
    }
    return count;
  }
}
