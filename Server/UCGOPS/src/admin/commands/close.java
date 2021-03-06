package admin.commands;

import players.PlayerChat;

public class close implements AdminCommand {

    @Override
    public boolean checkGMrights(PlayerChat p) {
        if (p.getUCGM() == 0x9) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void execute(PlayerChat p, String[] args) {

        config.Server.server_is_closed = true;

        chatServer.MultiClient.sendSystemMessage("Server is closed", p.getCharacter().getCharacterID());
    }

}
