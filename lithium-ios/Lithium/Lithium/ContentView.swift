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
            
            NavigationLink(value: "Lithium Labs") {
                VStack(spacing: 8) {
                    Text("Welcome to Lithium")
                    RoundedRectangle(cornerRadius: 10)
                        .frame(width: 200, height: 50)
                        .foregroundStyle(.cyan)
                        .overlay(
                            Text("Navigate")
                                .foregroundStyle(.white)
                        )

                }

            }
            .frame(maxWidth: .infinity, maxHeight: .infinity)
            .contentShape(Rectangle())
            
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
