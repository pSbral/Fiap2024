import game.menu.MenuPlayer
import game.player.Player

fun main(args: Array<String>) {
    val p:Player = Player()
    val menu: MenuPlayer = MenuPlayer();

    menu.menuRegister(p)
}