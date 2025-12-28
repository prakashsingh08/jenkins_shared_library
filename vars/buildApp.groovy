def call(String appName = "DemoApp") {
    echo "Building application: ${appName}"

    sh """
        echo "Simulating build step..."
        sleep 2
        echo "Build success for ${appName}!"
    """
}
