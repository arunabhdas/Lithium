//
//  ContentView.swift
//  Lithium
//
//  Created by Coder on 3/3/24.
//

import SwiftUI
import SwiftData

struct ContentView: View {
    @Environment(\.modelContext) private var modelContext
    @Query private var items: [Item]
    
    var body: some View {
        Text("Welcome to Lithium")
        
    }
}


#Preview {
    ContentView()
        .modelContainer(for: Item.self, inMemory: true)
}
