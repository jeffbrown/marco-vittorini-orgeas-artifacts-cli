package marco.vittorini.orgeas.artifacts.cli

import grails.gorm.services.Service

@Service(Widget)
interface WidgetService {
    Widget save(String name)
    List<Widget> list()
}
