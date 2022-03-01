package marco.vittorini.orgeas.artifacts.cli


import grails.dev.commands.*

class HelloCommand implements GrailsApplicationCommand {
    GreetingService greetingService
    WidgetService widgetService

    boolean handle() {

        println greetingService.greeting
        5.times {
            widgetService.save "Widget ${it + 1}"
        }
        def widgets = widgetService.list()
        for(Widget widget : widgets) {
            println "Name: ${widget.name}"
        }
        return true
    }
}
