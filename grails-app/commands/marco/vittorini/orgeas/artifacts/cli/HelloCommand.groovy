package marco.vittorini.orgeas.artifacts.cli


import grails.dev.commands.*

class HelloCommand implements GrailsApplicationCommand {
    GreetingService greetingService
    boolean handle() {

        println greetingService.greeting

        return true
    }
}
