class sudoku9 {
    void PrepareArray(int[][][] X) {
      int[][][] x = X;
      for (int i = 0; i < 9; i++) {
        for (int j = 0; j < 9; j++) {
          for (int k = 1; k <= 9; k++)
            x[i][j][k] = 0; 
        } 
      } 
    }
    
    public void main1(int[][][] c) {
      int s = 0, s1 = 0, v1 = 0, v2 = 0, v = 0;
      int[][][] A = c;
      for (int k1 = 0; k1 < 81; k1++) {
        int j;
        for (j = 0; j < 9; j++) {
          for (int k = 0; k < 9; k++) {
            if (A[j][k][0] == 0)
              for (int m = 0; m < 9; m++) {
                if (A[m][k][0] != 0) {
                  v = A[m][k][0];
                  A[j][k][v] = 1;
                } 
              }  
          } 
        } 
        v = 0;
        for (j = 0; j < 9; j++) {
          for (int k = 0; k < 9; k++) {
            if (A[j][k][0] == 0) {
              for (int m = 1; m <= 9; m++) {
                if (A[j][k][m] == 1) {
                  s++;
                  s1 += m;
                } 
              } 
              if (s == 8) {
                A[j][k][0] = 45 - s1;
                for (int i1 = 1; i1 <= 9; i1++)
                  A[j][k][i1] = 0; 
              } 
              s = 0;
              s1 = 0;
            } 
          } 
        } 
        s = 0;
        s1 = 0;
        for (j = 0; j < 9; j++) {
          for (int k = 0; k < 9; k++) {
            if (A[j][k][0] == 0)
              for (int m = 0; m < 9; m++) {
                if (A[j][m][0] != 0) {
                  v = A[j][m][0];
                  A[j][k][v] = 1;
                } 
              }  
          } 
        } 
        v = 0;
        for (j = 0; j < 9; j++) {
          for (int k = 0; k < 9; k++) {
            if (A[j][k][0] == 0) {
              for (int m = 1; m <= 9; m++) {
                if (A[j][k][m] == 1) {
                  s++;
                  s1 += m;
                } 
              } 
              if (s == 8) {
                A[j][k][0] = 45 - s1;
                for (int i1 = 1; i1 <= 9; i1++)
                  A[j][k][i1] = 0; 
              } 
              s = 0;
              s1 = 0;
            } 
          } 
        } 
        v = 0;
        s1 = 0;
        s = 0;
        for (j = 0; j < 9; j++) {
          for (int k = 0; k < 9; k++) {
            if (A[j][k][0] == 0) {
              v = j % 3;
              s1 = k % 3;
              for (int m = j - v; m < -v + 3 + j; m++) {
                for (int i1 = k - s1; i1 < k - s1 + 3; i1++) {
                  if (A[m][i1][0] != 0) {
                    v1 = A[m][i1][0];
                    A[j][k][v1] = 1;
                  } 
                } 
              } 
            } 
          } 
        } 
        s1 = 0;
        v = 0;
        v1 = 0;
        for (j = 0; j < 9; j++) {
          for (int k = 0; k < 9; k++) {
            if (A[j][k][0] == 0) {
              int m;
              for (m = 1; m <= 9; m++) {
                if (A[j][k][m] == 1) {
                  s = m + s;
                  s1++;
                } 
              } 
              if (s1 == 8) {
                A[j][k][0] = 45 - s;
                for (m = 1; m <= 9; m++)
                  A[j][k][m] = 0; 
              } 
              s1 = 0;
              s = 0;
            } 
          } 
        } 
        v = 0;
        s1 = 0;
        s = 0;
        s = 0;
        v1 = 0;
        v2 = 0;
        for (j = 1; j <= 9; j++) {
          for (int k = 0; k < 9; k++) {
            for (int m = 0; m < 9; m++) {
              if (A[k][m][0] == j) {
                s = 2;
              } else if (A[k][m][j] == 0 && A[k][m][0] == 0) {
                s++;
                v2 = m;
              } 
            } 
            if (s == 1) {
              A[k][v2][0] = j;
              for (int i1 = 1; i1 <= 9; i1++)
                A[k][v2][i1] = 0; 
            } 
            s = 0;
          } 
        } 
        s1 = 0;
        v = 0;
        v1 = 0;
        for (j = 0; j < 9; j++) {
          for (int k = 0; k < 9; k++) {
            if (A[j][k][0] == 0) {
              int m;
              for (m = 1; m <= 9; m++) {
                if (A[j][k][m] == 1) {
                  s = m + s;
                  s1++;
                } 
              } 
              if (s1 == 8) {
                A[j][k][0] = 45 - s;
                for (m = 1; m <= 9; m++)
                  A[j][k][m] = 0; 
              } 
              s1 = 0;
              s = 0;
            } 
          } 
        } 
        v = 0;
        s1 = 0;
        s = 0;
        s = 0;
        v1 = 0;
        v1 = 0;
        v2 = 0;
        s = 0;
        s1 = 0;
        for (j = 1; j <= 9; j++) {
          for (int k = 0; k < 9; k++) {
            for (int m = 0; m < 9; m++) {
              if (A[m][k][0] == j) {
                s = 2;
              } else if (A[m][k][j] == 0 && A[m][k][0] == 0) {
                s++;
                v1 = m;
              } 
            } 
            if (s == 1) {
              A[v1][k][0] = j;
              for (int i1 = 1; i1 <= 9; i1++)
                A[v1][k][i1] = 0; 
            } 
            s = 0;
            v1 = 0;
          } 
        } 
        s1 = 0;
        v = 0;
        v1 = 0;
        for (j = 0; j < 9; j++) {
          for (int k = 0; k < 9; k++) {
            if (A[j][k][0] == 0) {
              int m;
              for (m = 1; m <= 9; m++) {
                if (A[j][k][m] == 1) {
                  s = m + s;
                  s1++;
                } 
              } 
              if (s1 == 8) {
                A[j][k][0] = 45 - s;
                for (m = 1; m <= 9; m++)
                  A[j][k][m] = 0; 
              } 
              s1 = 0;
              s = 0;
            } 
          } 
        } 
        v = 0;
        s1 = 0;
        s = 0;
        s = 0;
        v1 = 0;
        for (int j1 = 1; j1 <= 9; j1++) {
          for (int k = 0; k < 9; k += 3) {
            for (int m = 0; m < 9; m += 3) {
              for (int n = k; n < k + 3; n++) {
                for (int i1 = m; i1 < 3 + m; i1++) {
                  if (A[n][i1][0] == j1) {
                    s = 2;
                  } else if (A[n][i1][j1] == 0 && A[n][i1][0] == 0) {
                    s++;
                    v1 = i1;
                    v2 = n;
                  } 
                } 
              } 
              if (s == 1) {
                A[v2][v1][0] = j1;
                for (int ay = 1; ay <= 9; ay++)
                  A[v2][v1][ay] = 0; 
              } 
              s = 0;
              v1 = 0;
              v2 = 0;
            } 
          } 
        } 
        s = 0;
        v1 = 0;
        v2 = 0;
        s1 = 0;
        s1 = 0;
        v = 0;
        v1 = 0;
        for (int i = 0; i < 9; i++) {
          for (int k = 0; k < 9; k++) {
            if (A[i][k][0] == 0) {
              int m;
              for (m = 1; m <= 9; m++) {
                if (A[i][k][m] == 1) {
                  s = m + s;
                  s1++;
                } 
              } 
              if (s1 == 8) {
                A[i][k][0] = 45 - s;
                for (m = 1; m <= 9; m++)
                  A[i][k][m] = 0; 
              } 
              s1 = 0;
              s = 0;
            } 
          } 
        } 
        v = 0;
        s1 = 0;
        s = 0;
      } 
    }
    
    boolean checkIfCorrect(int[][][] d8) {
      int p = 0;
      int[] c2 = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
      for (int k = 0; k < 9; k++) {
        for (int n = 0; n < 9; n++) {
          if (d8[k][n][0] != 0)
            c2[d8[k][n][0] - 1] = c2[d8[k][n][0] - 1] + 1; 
        } 
        for (int m = 0; m < 9; m++) {
          if (c2[m] > 1)
            p = 1; 
        } 
        for (int zz1 = 0; zz1 < 9; zz1++)
          c2[zz1] = 0; 
      } 
      for (int j = 0; j < 9; j++) {
        for (int n = 0; n < 9; n++) {
          if (d8[n][j][0] != 0)
            c2[d8[n][j][0] - 1] = c2[d8[n][j][0] - 1] + 1; 
        } 
        for (int m = 0; m < 9; m++) {
          if (c2[m] > 1)
            p = 1; 
        } 
        for (int zz1 = 0; zz1 < 9; zz1++)
          c2[zz1] = 0; 
      } 
      for (int i = 0; i < 9; i += 3) {
        for (int m = 0; m < 9; m += 3) {
          for (int n = i; n < i + 3; n++) {
            for (int i1 = m; i1 < m + 3; i1++) {
              if (d8[n][i1][0] != 0)
                c2[d8[n][i1][0] - 1] = c2[d8[n][i1][0] - 1] + 1; 
            } 
          } 
          for (int j1 = 0; j1 < 9; j1++) {
            if (c2[j1] > 1)
              p = 1; 
          } 
          for (int zz1 = 0; zz1 < 9; zz1++)
            c2[zz1] = 0; 
        } 
      } 
      if (p == 1)
        return false; 
      return true;
    }
    
    void acceptAnAssumedValue(int[][][] v71) {
      int ddd1 = 0;
      for (int i = 0; i < 9; i++) {
        if (ddd1 == 1)
          break; 
        for (int j = 0; j < 9; j++) {
          if (ddd1 == 1)
            break; 
          if (v71[i][j][0] == 0)
            for (int k = 1; k <= 9; k++) {
              if (ddd1 == 1)
                break; 
              if (v71[i][j][k] == 0) {
                v71[i][j][0] = k;
                ddd1 = 1;
              } 
            }  
        } 
      } 
    }
    
    boolean checkComplete(int[][][] r8) {
      int p = 0;
      for (int i = 0; i < 9; i++) {
        for (int j = 0; j < 9; j++) {
          if (r8[i][j][0] == 0)
            p = 1; 
        } 
      } 
      if (p == 0)
        return true; 
      return false;
    }
    
    void display(int[][][] q6) {
      for (int i = 0; i < 9; i++) {
        for (int j = 0; j < 9; j++)
          System.out.print(q6[i][j][0]); 
        System.out.println();
      } 
    }
  }
  