const fs = require('fs');
 // import { writeFile } from 'fs'; if you are using a typescript file

const environmentFile = `export const environment = {
  apiUrl: ${process.env.API_URI}, // add here your variables
  apiKey: ${process.env.API_KEY}, // add here your variables
  baseUrl: ${process.env.BASE_URI},
  production: '${process.env.PRODUCTION}'
};
`;

// Generate environment.ts file
fs.writeFile('./src/environments/environment.ts', environmentFile, function (err) {
  if (err) {
    throw console.error(err);
  } else {
    console.log(`Angular environment.ts file generated`);
  }
});


/*
Run npm node set-env.js (or npm ts-node set-env.ts) to generate your file  
*/