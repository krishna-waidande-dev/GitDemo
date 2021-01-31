def buildApp() {
    echo 'Master: Building the application'
}

def testApp() {
    echo 'Master: Testing the application'
}

def deployApp() {
    echo 'Master: Deploying the application'
    echo "Master: Deploying version${params.Version}"
}

return this
