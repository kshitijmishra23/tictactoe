package com.ticTacToe;

public class Board {
	
	public int grid[][];
	int dimentions;
	public Board(int n) {
		this.dimentions = n;
		grid = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				grid[i][j]=-n;
			}
		}
	}
	public int getRowSum(int row) {
		int sum=0;
		for(int i=0; i<grid.length; i++) {
			sum+=grid[row][i];
		}
		return sum;
	}
	
	public int getColSum(int col) {
		int sum =0 ;
		for(int i=0; i<grid.length; i++) {
			sum += grid[i][col];
		}
		return sum;
	}
	
	public int getDimentions() {
		return this.dimentions;
	}
	public void print() {
		System.out.println("------------------");
		for(int i=0;i<this.dimentions; i++) {
			for(int j=0; j<this.dimentions; j++) {
				if(this.grid[i][j] == 1) {
					System.out.print("X ");
				}
				else if(this.grid[i][j] == 0) {
					System.out.print("O ");
				}
				else
					System.out.print("- ");
			}
			System.out.println();
		}
		
	}


}
