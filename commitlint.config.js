module.exports = {
  parserPreset: {
    parserOpts: {
      headerPattern: /^(:\w+:) (.+)$/,
      headerCorrespondence: ['type', 'subject'],
    },
  },
  rules: {
    'type-enum': [
      2,
      'always',
      [
        ':sparkles:',  // New feature
        ':bug:',       // Bug fix
        ':memo:',      // Docs update
        ':customemoji:' // Your custom emoji
      ]
    ],
  },
};