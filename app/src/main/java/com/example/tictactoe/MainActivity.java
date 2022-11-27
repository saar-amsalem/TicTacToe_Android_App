package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    boolean winCheck(char[] board, int[] win) {
        if (board[1] == board[2] && board[2] == board[3] && board[3] != ' ') {
            win[0] = 123;
            Arrays.fill(board, '-');
            return true;
        } else if (board[4] == board[5] && board[5] == board[6] && board[6] != ' ') {
            win[0] = 456;
            Arrays.fill(board, '-');
            return true;
        } else if (board[7] == board[8] && board[8] == board[9] && board[9] != ' ') {
            win[0] = 789;
            Arrays.fill(board, '-');
            return true;
        } else if (board[1] == board[4] && board[4] == board[7] && board[7] != ' ') {
            win[0] = 147;
            Arrays.fill(board, '-');
            return true;
        } else if (board[2] == board[5] && board[5] == board[8] && board[8] != ' ') {
            win[0] = 258;
            Arrays.fill(board, '-');
            return true;
        } else if (board[3] == board[6] && board[6] == board[9] && board[9] != ' ') {
            win[0] = 369;
            Arrays.fill(board, '-');
            return true;
        } else if (board[3] == board[5] && board[5] == board[7] && board[7] != ' ') {
            win[0] = 357;
            Arrays.fill(board, '-');
            return true;
        } else if (board[1] == board[5] && board[5] == board[9] && board[9] != ' ') {
            win[0] = 159;
            Arrays.fill(board, '-');
            return true;
        }
        return false;
    }

    boolean spaceCheck(char[] board, int pos) {
        return board[pos] == ' ';
    }

    boolean full_board_check(char[] board) {
        boolean full = true;
        for (int i = 1; i < 10; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                full = false;
            }
        }
        return full;
    }


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView iv11 = findViewById(R.id.imageView11);
        ImageView iv12 = findViewById(R.id.imageView12);
        ImageView iv13 = findViewById(R.id.imageView13);
        ImageView iv21 = findViewById(R.id.imageView21);
        ImageView iv22 = findViewById(R.id.imageView22);
        ImageView iv23 = findViewById(R.id.imageView23);
        ImageView iv31 = findViewById(R.id.imageView31);
        ImageView iv32 = findViewById(R.id.imageView32);
        ImageView iv33 = findViewById(R.id.imageView33);
        ImageView win123 = findViewById(R.id.win123);
        ImageView win456 = findViewById(R.id.win456);
        ImageView win789 = findViewById(R.id.win789);
        ImageView win147 = findViewById(R.id.win147);
        ImageView win258 = findViewById(R.id.win258);
        ImageView win369 = findViewById(R.id.win369);
        ImageView win159 = findViewById(R.id.win159);
        ImageView win357 = findViewById(R.id.win357);
        TextView turn = findViewById(R.id.turn_tv);
        Button restart = findViewById(R.id.restart);
        int X = R.drawable.x;
        int O = R.drawable.o;

        boolean[] xturn = {true};
        char[] board = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
        int[] win = {0};

        iv11.setOnClickListener(view -> {
            if (spaceCheck(board, 1)) {
                if (xturn[0]) {
                    iv11.setImageResource(X);
                    board[1] = 'X';
                    xturn[0] = false;
                    turn.setText("It's O's Turn");
                    if (winCheck(board, win)) {
                        restart.setVisibility(View.VISIBLE);
                        switch (win[0]) {
                            case 123:
                                win123.setVisibility(View.VISIBLE);
                                turn.setText("X Has  Won!");
                                break;
                            case 456:
                                win456.setVisibility(View.VISIBLE);
                                turn.setText("X Has  Won!");
                                break;
                            case 789:
                                win789.setVisibility(View.VISIBLE);
                                turn.setText("X Has  Won!");
                                break;
                            case 147:
                                win147.setVisibility(View.VISIBLE);
                                turn.setText("X Has  Won!");
                                break;
                            case 258:
                                win258.setVisibility(View.VISIBLE);
                                turn.setText("X Has  Won!");
                                break;
                            case 369:
                                win369.setVisibility(View.VISIBLE);
                                turn.setText("X Has  Won!");
                                break;
                            case 159:
                                win159.setVisibility(View.VISIBLE);
                                turn.setText("X Has  Won!");
                                break;
                            case 357:
                                win357.setVisibility(View.VISIBLE);
                                turn.setText("X Has  Won!");
                                break;
                        }
                    } else if (full_board_check(board)) {
                        restart.setVisibility(View.VISIBLE);
                        turn.setText("Game Over!");
                    }
                } else {
                    iv11.setImageResource(O);
                    board[1] = 'O';
                    xturn[0] = true;
                    turn.setText("It's X's Turn");
                    if (winCheck(board, win)) {
                        restart.setVisibility(View.VISIBLE);

                        switch (win[0]) {
                            case 123:
                                win123.setVisibility(View.VISIBLE);
                                turn.setText("O Has  Won!");
                                break;
                            case 456:
                                win456.setVisibility(View.VISIBLE);
                                turn.setText("O Has  Won!");
                                break;
                            case 789:
                                win789.setVisibility(View.VISIBLE);
                                turn.setText("O Has  Won!");
                                break;
                            case 147:
                                win147.setVisibility(View.VISIBLE);
                                turn.setText("O Has  Won!");
                                break;
                            case 258:
                                win258.setVisibility(View.VISIBLE);
                                turn.setText("O Has  Won!");
                                break;
                            case 369:
                                win369.setVisibility(View.VISIBLE);
                                turn.setText("O Has  Won!");
                                break;
                            case 159:
                                win159.setVisibility(View.VISIBLE);
                                turn.setText("O Has  Won!");
                                break;
                            case 357:
                                win357.setVisibility(View.VISIBLE);
                                turn.setText("O Has  Won!");
                                break;
                        }
                    } else if (full_board_check(board)) {
                        restart.setVisibility(View.VISIBLE);
                        turn.setText("Game Over!");
                    }
                }
            }
        });

        iv12.setOnClickListener(view -> {
            if (spaceCheck(board, 2)) {
                if (xturn[0]) {
                    iv12.setImageResource(X);
                    board[2] = 'X';
                    xturn[0] = false;
                    turn.setText("It's O's Turn");
                    if (winCheck(board, win)) {
                        restart.setVisibility(View.VISIBLE);
                        switch (win[0]) {
                            case 123:
                                win123.setVisibility(View.VISIBLE);
                                turn.setText("X Has  Won!");
                                break;
                            case 456:
                                win456.setVisibility(View.VISIBLE);
                                turn.setText("X Has  Won!");
                                break;
                            case 789:
                                win789.setVisibility(View.VISIBLE);
                                turn.setText("X Has  Won!");
                                break;
                            case 147:
                                win147.setVisibility(View.VISIBLE);
                                turn.setText("X Has  Won!");
                                break;
                            case 258:
                                win258.setVisibility(View.VISIBLE);
                                turn.setText("X Has  Won!");
                                break;
                            case 369:
                                win369.setVisibility(View.VISIBLE);
                                turn.setText("X Has  Won!");
                                break;
                            case 159:
                                win159.setVisibility(View.VISIBLE);
                                turn.setText("X Has  Won!");
                                break;
                            case 357:
                                win357.setVisibility(View.VISIBLE);
                                turn.setText("X Has  Won!");
                                break;
                        }
                    } else if (full_board_check(board)) {
                        restart.setVisibility(View.VISIBLE);
                        turn.setText("Game Over!");
                    }
                } else {
                    iv12.setImageResource(O);
                    board[2] = 'O';
                    xturn[0] = true;
                    turn.setText("It's X's Turn");
                    if (winCheck(board, win)) {
                        restart.setVisibility(View.VISIBLE);
                        switch (win[0]) {
                            case 123:
                                win123.setVisibility(View.VISIBLE);
                                turn.setText("O Has  Won!");
                                break;
                            case 456:
                                win456.setVisibility(View.VISIBLE);
                                turn.setText("O Has  Won!");
                                break;
                            case 789:
                                win789.setVisibility(View.VISIBLE);
                                turn.setText("O Has  Won!");
                                break;
                            case 147:
                                win147.setVisibility(View.VISIBLE);
                                turn.setText("O Has  Won!");
                                break;
                            case 258:
                                win258.setVisibility(View.VISIBLE);
                                turn.setText("O Has  Won!");
                                break;
                            case 369:
                                win369.setVisibility(View.VISIBLE);
                                turn.setText("O Has  Won!");
                                break;
                            case 159:
                                win159.setVisibility(View.VISIBLE);
                                turn.setText("O Has  Won!");
                                break;
                            case 357:
                                win357.setVisibility(View.VISIBLE);
                                turn.setText("O Has  Won!");
                                break;
                        }
                    } else if (full_board_check(board)) {
                        restart.setVisibility(View.VISIBLE);
                        turn.setText("Game Over!");
                    }
                }
            }
        });

        iv13.setOnClickListener(view -> {
            if (spaceCheck(board, 3)) {
                if (xturn[0]) {
                    iv13.setImageResource(X);
                    board[3] = 'X';
                    xturn[0] = false;
                    turn.setText("It's O's Turn");
                    if (winCheck(board, win)) {
                        restart.setVisibility(View.VISIBLE);
                        switch (win[0]) {
                            case 123:
                                win123.setVisibility(View.VISIBLE);
                                turn.setText("X Has  Won!");
                                break;
                            case 456:
                                win456.setVisibility(View.VISIBLE);
                                turn.setText("X Has  Won!");
                                break;
                            case 789:
                                win789.setVisibility(View.VISIBLE);
                                turn.setText("X Has  Won!");
                                break;
                            case 147:
                                win147.setVisibility(View.VISIBLE);
                                turn.setText("X Has  Won!");
                                break;
                            case 258:
                                win258.setVisibility(View.VISIBLE);
                                turn.setText("X Has  Won!");
                                break;
                            case 369:
                                win369.setVisibility(View.VISIBLE);
                                turn.setText("X Has  Won!");
                                break;
                            case 159:
                                win159.setVisibility(View.VISIBLE);
                                turn.setText("X Has  Won!");
                                break;
                            case 357:
                                win357.setVisibility(View.VISIBLE);
                                turn.setText("X Has  Won!");
                                break;
                        }
                    } else if (full_board_check(board)) {
                        restart.setVisibility(View.VISIBLE);
                        turn.setText("Game Over!");
                    }
                } else {
                    iv13.setImageResource(O);
                    board[3] = 'O';
                    xturn[0] = true;
                    turn.setText("It's X's Turn");
                    if (winCheck(board, win)) {
                        restart.setVisibility(View.VISIBLE);
                        switch (win[0]) {
                            case 123:
                                win123.setVisibility(View.VISIBLE);
                                turn.setText("O Has  Won!");
                                break;
                            case 456:
                                win456.setVisibility(View.VISIBLE);
                                turn.setText("O Has  Won!");
                                break;
                            case 789:
                                win789.setVisibility(View.VISIBLE);
                                turn.setText("O Has  Won!");
                                break;
                            case 147:
                                win147.setVisibility(View.VISIBLE);
                                turn.setText("O Has  Won!");
                                break;
                            case 258:
                                win258.setVisibility(View.VISIBLE);
                                turn.setText("O Has  Won!");
                                break;
                            case 369:
                                win369.setVisibility(View.VISIBLE);
                                turn.setText("O Has  Won!");
                                break;
                            case 159:
                                win159.setVisibility(View.VISIBLE);
                                turn.setText("O Has  Won!");
                                break;
                            case 357:
                                win357.setVisibility(View.VISIBLE);
                                turn.setText("O Has  Won!");
                                break;
                        }
                    } else if (full_board_check(board)) {
                        restart.setVisibility(View.VISIBLE);
                        turn.setText("Game Over!");
                    }
                }
            }
        });

        iv21.setOnClickListener(view -> {
            if (spaceCheck(board, 4)) {
                if (xturn[0]) {
                    iv21.setImageResource(X);
                    board[4] = 'X';
                    xturn[0] = false;
                    turn.setText("It's O's Turn");
                    if (winCheck(board, win)) {
                        restart.setVisibility(View.VISIBLE);
                        switch (win[0]) {
                            case 123:
                                win123.setVisibility(View.VISIBLE);
                                turn.setText("X Has  Won!");
                                break;
                            case 456:
                                win456.setVisibility(View.VISIBLE);
                                turn.setText("X Has  Won!");
                                break;
                            case 789:
                                win789.setVisibility(View.VISIBLE);
                                turn.setText("X Has  Won!");
                                break;
                            case 147:
                                win147.setVisibility(View.VISIBLE);
                                turn.setText("X Has  Won!");
                                break;
                            case 258:
                                win258.setVisibility(View.VISIBLE);
                                turn.setText("X Has  Won!");
                                break;
                            case 369:
                                win369.setVisibility(View.VISIBLE);
                                turn.setText("X Has  Won!");
                                break;
                            case 159:
                                win159.setVisibility(View.VISIBLE);
                                turn.setText("X Has  Won!");
                                break;
                            case 357:
                                win357.setVisibility(View.VISIBLE);
                                turn.setText("X Has  Won!");
                                break;
                        }
                    } else if (full_board_check(board)) {
                        restart.setVisibility(View.VISIBLE);
                        turn.setText("Game Over!");
                    }
                } else {
                    iv21.setImageResource(O);
                    board[4] = 'O';
                    xturn[0] = true;
                    turn.setText("It's X's Turn");
                    if (winCheck(board, win)) {
                        restart.setVisibility(View.VISIBLE);
                        switch (win[0]) {
                            case 123:
                                win123.setVisibility(View.VISIBLE);
                                turn.setText("O Has  Won!");
                                break;
                            case 456:
                                win456.setVisibility(View.VISIBLE);
                                turn.setText("O Has  Won!");
                                break;
                            case 789:
                                win789.setVisibility(View.VISIBLE);
                                turn.setText("O Has  Won!");
                                break;
                            case 147:
                                win147.setVisibility(View.VISIBLE);
                                turn.setText("O Has  Won!");
                                break;
                            case 258:
                                win258.setVisibility(View.VISIBLE);
                                turn.setText("O Has  Won!");
                                break;
                            case 369:
                                win369.setVisibility(View.VISIBLE);
                                turn.setText("O Has  Won!");
                                break;
                            case 159:
                                win159.setVisibility(View.VISIBLE);
                                turn.setText("O Has  Won!");
                                break;
                            case 357:
                                win357.setVisibility(View.VISIBLE);
                                turn.setText("O Has  Won!");
                                break;
                        }
                    } else if (full_board_check(board)) {
                        restart.setVisibility(View.VISIBLE);
                        turn.setText("Game Over!");
                    }
                }
            }
        });

        iv22.setOnClickListener(view -> {
            if (spaceCheck(board, 5)) {
                if (xturn[0]) {
                    iv22.setImageResource(X);
                    board[5] = 'X';
                    xturn[0] = false;
                    turn.setText("It's O's Turn");
                    if (winCheck(board, win)) {
                        restart.setVisibility(View.VISIBLE);
                        switch (win[0]) {
                            case 123:
                                win123.setVisibility(View.VISIBLE);
                                turn.setText("X Has  Won!");
                                break;
                            case 456:
                                win456.setVisibility(View.VISIBLE);
                                turn.setText("X Has  Won!");
                                break;
                            case 789:
                                win789.setVisibility(View.VISIBLE);
                                turn.setText("X Has  Won!");
                                break;
                            case 147:
                                win147.setVisibility(View.VISIBLE);
                                turn.setText("X Has  Won!");
                                break;
                            case 258:
                                win258.setVisibility(View.VISIBLE);
                                turn.setText("X Has  Won!");
                                break;
                            case 369:
                                win369.setVisibility(View.VISIBLE);
                                turn.setText("X Has  Won!");
                                break;
                            case 159:
                                win159.setVisibility(View.VISIBLE);
                                turn.setText("X Has  Won!");
                                break;
                            case 357:
                                win357.setVisibility(View.VISIBLE);
                                turn.setText("X Has  Won!");
                                break;
                        }
                    } else if (full_board_check(board)) {
                        restart.setVisibility(View.VISIBLE);
                        turn.setText("Game Over!");
                    }
                } else {
                    iv22.setImageResource(O);
                    board[5] = 'O';
                    xturn[0] = true;
                    turn.setText("It's X's Turn");
                    if (winCheck(board, win)) {
                        restart.setVisibility(View.VISIBLE);
                        switch (win[0]) {
                            case 123:
                                win123.setVisibility(View.VISIBLE);
                                turn.setText("O Has  Won!");
                                break;
                            case 456:
                                win456.setVisibility(View.VISIBLE);
                                turn.setText("O Has  Won!");
                                break;
                            case 789:
                                win789.setVisibility(View.VISIBLE);
                                turn.setText("O Has  Won!");
                                break;
                            case 147:
                                win147.setVisibility(View.VISIBLE);
                                turn.setText("O Has  Won!");
                                break;
                            case 258:
                                win258.setVisibility(View.VISIBLE);
                                turn.setText("O Has  Won!");
                                break;
                            case 369:
                                win369.setVisibility(View.VISIBLE);
                                turn.setText("O Has  Won!");
                                break;
                            case 159:
                                win159.setVisibility(View.VISIBLE);
                                turn.setText("O Has  Won!");
                                break;
                            case 357:
                                win357.setVisibility(View.VISIBLE);
                                turn.setText("O Has  Won!");
                                break;
                        }
                    } else if (full_board_check(board)) {
                        restart.setVisibility(View.VISIBLE);
                        turn.setText("Game Over!");
                    }
                }
            }
        });

        iv23.setOnClickListener(view -> {
            if (spaceCheck(board, 6)) {
                if (xturn[0]) {
                    iv23.setImageResource(X);
                    board[6] = 'X';
                    xturn[0] = false;
                    turn.setText("It's O's Turn");
                    if (winCheck(board, win)) {
                        restart.setVisibility(View.VISIBLE);
                        switch (win[0]) {
                            case 123:
                                win123.setVisibility(View.VISIBLE);
                                turn.setText("X Has  Won!");
                                break;
                            case 456:
                                win456.setVisibility(View.VISIBLE);
                                turn.setText("X Has  Won!");
                                break;
                            case 789:
                                win789.setVisibility(View.VISIBLE);
                                turn.setText("X Has  Won!");
                                break;
                            case 147:
                                win147.setVisibility(View.VISIBLE);
                                turn.setText("X Has  Won!");
                                break;
                            case 258:
                                win258.setVisibility(View.VISIBLE);
                                turn.setText("X Has  Won!");
                                break;
                            case 369:
                                win369.setVisibility(View.VISIBLE);
                                turn.setText("X Has  Won!");
                                break;
                            case 159:
                                win159.setVisibility(View.VISIBLE);
                                turn.setText("X Has  Won!");
                                break;
                            case 357:
                                win357.setVisibility(View.VISIBLE);
                                turn.setText("X Has  Won!");
                                break;
                        }
                    } else if (full_board_check(board)) {
                        restart.setVisibility(View.VISIBLE);
                        turn.setText("Game Over!");
                    }
                } else {
                    iv23.setImageResource(O);
                    board[6] = 'O';
                    xturn[0] = true;
                    turn.setText("It's X's Turn");
                    if (winCheck(board, win)) {
                        restart.setVisibility(View.VISIBLE);
                        switch (win[0]) {
                            case 123:
                                win123.setVisibility(View.VISIBLE);
                                turn.setText("O Has  Won!");
                                break;
                            case 456:
                                win456.setVisibility(View.VISIBLE);
                                turn.setText("O Has  Won!");
                                break;
                            case 789:
                                win789.setVisibility(View.VISIBLE);
                                turn.setText("O Has  Won!");
                                break;
                            case 147:
                                win147.setVisibility(View.VISIBLE);
                                turn.setText("O Has  Won!");
                                break;
                            case 258:
                                win258.setVisibility(View.VISIBLE);
                                turn.setText("O Has  Won!");
                                break;
                            case 369:
                                win369.setVisibility(View.VISIBLE);
                                turn.setText("O Has  Won!");
                                break;
                            case 159:
                                win159.setVisibility(View.VISIBLE);
                                turn.setText("O Has  Won!");
                                break;
                            case 357:
                                win357.setVisibility(View.VISIBLE);
                                turn.setText("O Has  Won!");
                                break;
                        }
                    } else if (full_board_check(board)) {
                        restart.setVisibility(View.VISIBLE);
                        turn.setText("Game Over!");
                    }
                }
            }
        });

        iv31.setOnClickListener(view -> {
            if (spaceCheck(board, 7)) {
                if (xturn[0]) {
                    iv31.setImageResource(X);
                    board[7] = 'X';
                    xturn[0] = false;
                    turn.setText("It's O's Turn");
                    if (winCheck(board, win)) {
                        restart.setVisibility(View.VISIBLE);
                        switch (win[0]) {
                            case 123:
                                win123.setVisibility(View.VISIBLE);
                                turn.setText("X Has  Won!");
                                break;
                            case 456:
                                win456.setVisibility(View.VISIBLE);
                                turn.setText("X Has  Won!");
                                break;
                            case 789:
                                win789.setVisibility(View.VISIBLE);
                                turn.setText("X Has  Won!");
                                break;
                            case 147:
                                win147.setVisibility(View.VISIBLE);
                                turn.setText("X Has  Won!");
                                break;
                            case 258:
                                win258.setVisibility(View.VISIBLE);
                                turn.setText("X Has  Won!");
                                break;
                            case 369:
                                win369.setVisibility(View.VISIBLE);
                                turn.setText("X Has  Won!");
                                break;
                            case 159:
                                win159.setVisibility(View.VISIBLE);
                                turn.setText("X Has  Won!");
                                break;
                            case 357:
                                win357.setVisibility(View.VISIBLE);
                                turn.setText("X Has  Won!");
                                break;
                        }
                    } else if (full_board_check(board)) {
                        restart.setVisibility(View.VISIBLE);
                        turn.setText("Game Over!");
                    }
                } else {
                    iv31.setImageResource(O);
                    board[7] = 'O';
                    xturn[0] = true;
                    turn.setText("It's X's Turn");
                    if (winCheck(board, win)) {
                        restart.setVisibility(View.VISIBLE);
                        switch (win[0]) {
                            case 123:
                                win123.setVisibility(View.VISIBLE);
                                turn.setText("O Has  Won!");
                                break;
                            case 456:
                                win456.setVisibility(View.VISIBLE);
                                turn.setText("O Has  Won!");
                                break;
                            case 789:
                                win789.setVisibility(View.VISIBLE);
                                turn.setText("O Has  Won!");
                                break;
                            case 147:
                                win147.setVisibility(View.VISIBLE);
                                turn.setText("O Has  Won!");
                                break;
                            case 258:
                                win258.setVisibility(View.VISIBLE);
                                turn.setText("O Has  Won!");
                                break;
                            case 369:
                                win369.setVisibility(View.VISIBLE);
                                turn.setText("O Has  Won!");
                                break;
                            case 159:
                                win159.setVisibility(View.VISIBLE);
                                turn.setText("O Has  Won!");
                                break;
                            case 357:
                                win357.setVisibility(View.VISIBLE);
                                turn.setText("O Has  Won!");
                                break;
                        }
                    } else if (full_board_check(board)) {
                        restart.setVisibility(View.VISIBLE);
                        turn.setText("Game Over!");
                    }
                }
            }
        });

        iv32.setOnClickListener(view -> {
            if (spaceCheck(board, 8)) {
                if (xturn[0]) {
                    iv32.setImageResource(X);
                    board[8] = 'X';
                    xturn[0] = false;
                    turn.setText("It's O's Turn");
                    if (winCheck(board, win)) {
                        restart.setVisibility(View.VISIBLE);
                        switch (win[0]) {
                            case 123:
                                win123.setVisibility(View.VISIBLE);
                                turn.setText("X Has  Won!");
                                break;
                            case 456:
                                win456.setVisibility(View.VISIBLE);
                                turn.setText("X Has  Won!");
                                break;
                            case 789:
                                win789.setVisibility(View.VISIBLE);
                                turn.setText("X Has  Won!");
                                break;
                            case 147:
                                win147.setVisibility(View.VISIBLE);
                                turn.setText("X Has  Won!");
                                break;
                            case 258:
                                win258.setVisibility(View.VISIBLE);
                                turn.setText("X Has  Won!");
                                break;
                            case 369:
                                win369.setVisibility(View.VISIBLE);
                                turn.setText("X Has  Won!");
                                break;
                            case 159:
                                win159.setVisibility(View.VISIBLE);
                                turn.setText("X Has  Won!");
                                break;
                            case 357:
                                win357.setVisibility(View.VISIBLE);
                                turn.setText("X Has  Won!");
                                break;
                        }
                    } else if (full_board_check(board)) {
                        restart.setVisibility(View.VISIBLE);
                        turn.setText("Game Over!");
                    }
                } else {
                    iv32.setImageResource(O);
                    board[8] = 'O';
                    xturn[0] = true;
                    turn.setText("It's X's Turn");
                    if (winCheck(board, win)) {
                        restart.setVisibility(View.VISIBLE);
                        switch (win[0]) {
                            case 123:
                                win123.setVisibility(View.VISIBLE);
                                turn.setText("O Has  Won!");
                                break;
                            case 456:
                                win456.setVisibility(View.VISIBLE);
                                turn.setText("O Has  Won!");
                                break;
                            case 789:
                                win789.setVisibility(View.VISIBLE);
                                turn.setText("O Has  Won!");
                                break;
                            case 147:
                                win147.setVisibility(View.VISIBLE);
                                turn.setText("O Has  Won!");
                                break;
                            case 258:
                                win258.setVisibility(View.VISIBLE);
                                turn.setText("O Has  Won!");
                                break;
                            case 369:
                                win369.setVisibility(View.VISIBLE);
                                turn.setText("O Has  Won!");
                                break;
                            case 159:
                                win159.setVisibility(View.VISIBLE);
                                turn.setText("O Has  Won!");
                                break;
                            case 357:
                                win357.setVisibility(View.VISIBLE);
                                turn.setText("O Has  Won!");
                                break;
                        }
                    } else if (full_board_check(board)) {
                        restart.setVisibility(View.VISIBLE);
                        turn.setText("Game Over!");
                    }
                }
            }
        });

        iv33.setOnClickListener(view -> {
            if (spaceCheck(board, 9)) {
                if (xturn[0]) {
                    iv33.setImageResource(X);
                    board[9] = 'X';
                    xturn[0] = false;
                    turn.setText("It's O's Turn");
                    if (winCheck(board, win)) {
                        restart.setVisibility(View.VISIBLE);
                        switch (win[0]) {
                            case 123:
                                win123.setVisibility(View.VISIBLE);
                                turn.setText("X Has  Won!");
                                break;
                            case 456:
                                win456.setVisibility(View.VISIBLE);
                                turn.setText("X Has  Won!");
                                break;
                            case 789:
                                win789.setVisibility(View.VISIBLE);
                                turn.setText("X Has  Won!");
                                break;
                            case 147:
                                win147.setVisibility(View.VISIBLE);
                                turn.setText("X Has  Won!");
                                break;
                            case 258:
                                win258.setVisibility(View.VISIBLE);
                                turn.setText("X Has  Won!");
                                break;
                            case 369:
                                win369.setVisibility(View.VISIBLE);
                                turn.setText("X Has  Won!");
                                break;
                            case 159:
                                win159.setVisibility(View.VISIBLE);
                                turn.setText("X Has  Won!");
                                break;
                            case 357:
                                win357.setVisibility(View.VISIBLE);
                                turn.setText("X Has  Won!");
                                break;
                        }
                    } else if (full_board_check(board)) {
                        restart.setVisibility(View.VISIBLE);
                        turn.setText("Game Over!");
                    }
                } else {
                    iv33.setImageResource(O);
                    board[9] = 'O';
                    xturn[0] = true;
                    turn.setText("It's X's Turn");
                    if (winCheck(board, win)) {
                        restart.setVisibility(View.VISIBLE);
                        switch (win[0]) {
                            case 123:
                                win123.setVisibility(View.VISIBLE);
                                turn.setText("O Has  Won!");
                                break;
                            case 456:
                                win456.setVisibility(View.VISIBLE);
                                turn.setText("O Has  Won!");
                                break;
                            case 789:
                                win789.setVisibility(View.VISIBLE);
                                turn.setText("O Has  Won!");
                                break;
                            case 147:
                                win147.setVisibility(View.VISIBLE);
                                turn.setText("O Has  Won!");
                                break;
                            case 258:
                                win258.setVisibility(View.VISIBLE);
                                turn.setText("O Has  Won!");
                                break;
                            case 369:
                                win369.setVisibility(View.VISIBLE);
                                turn.setText("O Has  Won!");
                                break;
                            case 159:
                                win159.setVisibility(View.VISIBLE);
                                turn.setText("O Has  Won!");
                                break;
                            case 357:
                                win357.setVisibility(View.VISIBLE);
                                turn.setText("O Has  Won!");
                                break;
                        }
                    } else if (full_board_check(board)) {
                        restart.setVisibility(View.VISIBLE);
                        turn.setText("Game Over!");
                    }
                }
            }
        });

        restart.setOnClickListener(view -> {
            Intent intent = getIntent();
            finish();
            startActivity(intent);
        });
    }
}