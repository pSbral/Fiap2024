import game.menu.MenuPlayer
import game.player.Player

fun main(args: Array<String>) {
    val p:Player = Player()
    val menu: MenuPlayer = MenuPlayer();

    menu.menuRegister(p)


    var user_choice = menu.menuMain(p)

    when(user_choice) {
        1 -> menu.menuExplore(p)
    }
}