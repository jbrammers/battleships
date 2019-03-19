package Server;

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
                    // TODO add changes to game board here
                    player.getOpponent().getOut().println("GAME Your opponent fired at " + message);
                    player.getOut().println("GAME Hit/Miss/Sunk"); // TODO add result of shot here
                    break;

                case "ECHO":
                    break;

                case "SYSTEM":
                    if (message.equals("ready")) {
                        player.setReady(true);
                    }
                    break;

                default:
                    System.out.println(in);
                    System.out.println("Identifier unexpected, please report this problem.");
                    break;
            }
            player.getOut().flush();
        }
    }
}
