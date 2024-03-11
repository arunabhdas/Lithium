//
//  LithiumVisionApp.swift
//  LithiumVision
//
//  Created by Coder on 3/11/24.
//

import SwiftUI

@main
struct LithiumVisionApp: App {
    var body: some Scene {
        WindowGroup {
            ContentView()
        }

        ImmersiveSpace(id: "ImmersiveSpace") {
            ImmersiveView()
        }
    }
}
