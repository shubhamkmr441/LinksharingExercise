package linksharing

class Topic {
    static hasMany = [subscriptions1: Subscription, resources1: Resource]
    String name
    Date datecreated
    Date lastupdated

    enum  Visibility {
        Public, Private
    }
    static constraints = {

    }
}
