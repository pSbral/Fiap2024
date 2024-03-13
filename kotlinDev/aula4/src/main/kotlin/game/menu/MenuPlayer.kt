package game.menu

import game.player.Job
import game.player.Player
import java.util.Scanner

class MenuPlayer {
    fun menuRegister(p:Player){
        val j:Job = Job()
        val input:Scanner = Scanner(System.`in`)

        print("name: ")
        val name = input.nextLine()
        p.playerName = name

        while (true) {
            var i:Int = 1;
            print("Choose your job:\n")
            j.jobList.forEach(){ print("${i++}. $it \n") }
            print("=> ")
            val job = input.nextInt()

            if (job < 3 || job > 1) {
                p.playerJob.jobName = j.jobList[job-1]
                break
            }
        }
    }
}