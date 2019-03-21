package Server;

import java.io.IOException;

public class MessageHandler {
    public static void inputCheck(String in, Player player) {
        if (in == null) {
        } else {

            String identifier;
            String message = null;
            if (in.contains(" ")) {
                identifier = in.substring(0, in.indexOf(" "));
                message = in.substring(in.indexOf(" ") + 1);
            } else {
                identifier = in;
            }

            switch (identifier) {

                case "MESSAGE":
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(identifier);
                    stringBuffer.append(" ");
                    stringBuffer.append(player.getUsername());
                    stringBuffer.append(" ");
                    stringBuffer.append(message);

                    player.getOut().println(stringBuffer);
                    try {
                        player.getOpponent().getOut().println(stringBuffer);
                    } catch (NullPointerException e) {
                        player.getOut().println("MESSAGE No opponent connected yet!");
                    }
                    return;

                case "GAME":
                    player.getOpponent().getOut().println(in);
                    break;

                case "ECHO":
                    break;

                case "SYSTEM":
                    if (message.equals("turnchange")) {
                        player.getOut().println("SYSTEM yourturn");
                        player.getOpponent().getOut().println("SYSTEM theirturn");
                        System.out.println("Turn changes sent");
                    }
                    if (message.equals("ready")) {
                        player.setReady(true);
                    } else if (message.equals("gameEnd")) {
                        try {
                            player.getGame().endGame();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    } else if (message.equals("nullattempt")) {
                        player.getOut().println("SYSTEM theirturn");
                        player.getOpponent().getOut().println("SYSTEM yourturn");
                        player.getOpponent().getOut().println(in);
                    }
                    break;

                case "LOGIN":
                    break;

                default:
                    System.out.println("Error: Identifier unexpected.");
                    break;
            }
            player.getOut().flush();
            if (player.getOpponent() != null) {
                player.getOpponent().getOut().flush();
            }
        }
    }
}
