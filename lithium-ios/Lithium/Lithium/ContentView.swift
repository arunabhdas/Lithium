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
    @State var stack: [String] = []
    @State var isPresented: Bool = false
    
    var body: some View {
        NavigationStack {
                VStack(spacing: 8) {
                    Text("Welcome to Lithium")
                    Button {
                        isPresented.toggle()
                        
                    } label: {
                        Text("Navigate to Screen 2")
                    }
                }
            .frame(maxWidth: .infinity, maxHeight: .infinity)
            .contentShape(Rectangle())
            
            .navigationDestination(isPresented: $isPresented) {
                NavigationStack {
                    VStack {
                        Text("Screen 2")
                    }
                }
                
            }

        }
        
    }
}


#Preview {
    ContentView()
        .modelContainer(for: Item.self, inMemory: true)
}
