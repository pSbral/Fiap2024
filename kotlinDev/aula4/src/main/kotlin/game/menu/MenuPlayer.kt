package game.menu

import game.player.Job
import game.player.Player
import java.util.InputMismatchException
import java.util.Scanner

class MenuPlayer {
    val menuList = listOf("Explore", "Exit")

    fun menuMain(p:Player):Int {
        println("---------- RPG ---------")
        println("Welcome, ${p.playerName}\n")

        var i:Int = 1
        menuList.forEach(){ print("${i++}. $it \n") }

        val input:Scanner = Scanner(System.`in`)
        var p_choice:Int

        while(true) {
            print("=> ")

            try {
                p_choice = input.nextInt()

                if ( p_choice < menuList.size || p_choice > 0){
                    break
                }
            } catch (e: ArrayIndexOutOfBoundsException) {
                println("input invalido")
            } catch (e: InputMismatchException) {
                println("input invalido")
                input.next()
            }
        }
        return  p_choice
    }

    fun menuRegister(p:Player) {
        val j:Job = Job()
        val input:Scanner = Scanner(System.`in`)

        print("name: ")
        val name = input.nextLine()
        p.playerName = name

        var i:Int = 1;
        print("Choose your job:\n")
        j.jobList.forEach(){ print("${i++}. $it \n") }

        while(true) {
            print("=> ")

            try {
                val p_job = input.nextInt()

                if (p_job < j.jobList.size || p_job > 0) {
                    p.playerJob.jobName = j.jobList[p_job-1]
                    break
                }
            } catch (e: ArrayIndexOutOfBoundsException) {
                println("input invalido")
            } catch (e: InputMismatchException) {
                println("input invalido")
                input.next()
            }
        }
    }

    fun menuExplore(p:Player) {
        val encounter = (0..100).random()

        when(encounter) {
            in 0..10 -> print("Treasure")
            in 11..40 -> print("NPC")
            in 41..100 -> print("Combat")
        }

    }
}