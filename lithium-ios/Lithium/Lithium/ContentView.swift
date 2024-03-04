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
        NavigationStack {
            Text("Welcome to Lithium")
            NavigationLink(value: "Lithium Labs") {
                RoundedRectangle(cornerRadius: 10)
                    .frame(width: 200, height: 50)
                    .foregroundStyle(.red)
                Text("Navigate")
                    .foregroundStyle(.white)
            }
            .navigationDestination(for: String.self) { value in
                Text("Screen 2\(value)")
            }
        }
        

        
    }
}


#Preview {
    ContentView()
        .modelContainer(for: Item.self, inMemory: true)
}
